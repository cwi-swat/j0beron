package j0beron.interpreter.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jdepend.framework.PackageFilter;
import jdepend.textui.JDepend;




public class Main {
	public static void main(String[] args) throws IOException {
//		new QuickSortTests(1000, 100).run();
//		javaNCSS("-ncss", "-all", "-recursive", "@javancss2.lst");
//		javaNCSS("-ncss", "-all", "-xml", "-recursive", "-out", "javancss.xml", "@javancss2.lst");
		jDependConsole("bin/j0beron2");
//		jDependXML("bin", "jdepend.xml");
	}
	
	private static void javaNCSS(String ...args) throws IOException {
		Locale.setDefault(Locale.US);
		new javancss.Javancss(args);
	}
	
	private static void jDependConsole(String dir) throws IOException {
		JDepend jdepend = new JDepend();
		jdepend.setFilter(exclusions());
		jdepend.addDirectory(dir);
		jdepend.analyze();
	}

	private static PackageFilter exclusions() {
		PackageFilter filter = new PackageFilter();
		filter.addPackage("j0beron2.utils");
		filter.addPackage("jdepend");
		filter.addPackage("javancss");
		return filter;
	}

	private static void jDependXML(String dir, String output) throws IOException {
		jdepend.xmlui.JDepend jdepend = new jdepend.xmlui.JDepend();
		jdepend.setFilter(exclusions());
		PrintWriter writer = new PrintWriter(new File(output));
		jdepend.setWriter(writer);
		jdepend.addDirectory(dir);
		jdepend.analyze();
		writer.close();
	}
}
