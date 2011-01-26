package j0beron;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jdepend.textui.JDepend;




public class CollectMetrics {
	private static final String INTERPRETER = "interpreter";
	private static final String VISITOR = "visitor";
	
	public static void main(String[] args) throws IOException {
		javaNCSSmetrics(INTERPRETER);
		javaNCSSmetrics(VISITOR);
		
		jDependMetrics(INTERPRETER);
		jDependMetrics(VISITOR);
	}
	
	private static void jDependMetrics(String stem) throws IOException {
		String path = "bin/j0beron/" + stem;
		jDependConsole(path);
		jDependXML(path, stem + "-deps.xml");
	}

	private static void javaNCSSmetrics(String stem) throws IOException {
		javaNCSS("-ncss", "-all", "-recursive", fileList(stem));
		javaNCSS("-ncss", "-all", "-xml", "-recursive", "-out",  stem + "-ncss.xml", fileList(stem));
	}

	private static String fileList(String stem) {
		return "@" + stem + ".files";
	}
	
	private static void javaNCSS(String ...args) throws IOException {
		Locale.setDefault(Locale.US);
		new javancss.Javancss(args);
	}
	
	private static void jDependConsole(String dir) throws IOException {
		JDepend jdepend = new JDepend();
		jdepend.addDirectory(dir);
		jdepend.analyze();
	}


	private static void jDependXML(String dir, String output) throws IOException {
		jdepend.xmlui.JDepend jdepend = new jdepend.xmlui.JDepend();
		PrintWriter writer = new PrintWriter(new File(output));
		jdepend.setWriter(writer);
		jdepend.addDirectory(dir);
		jdepend.analyze();
		writer.close();
	}
}
