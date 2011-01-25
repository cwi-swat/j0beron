// Output created by jacc on Tue Jan 25 16:21:56 CET 2011

package j0beron.parser;

import j0beron.ast.expr.*;
import j0beron.ast.stat.*;
import j0beron.ast.decl.*;
import j0beron.ast.type.*;


class Oberon0Parser implements Oberon0Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private j0beron.ast.ASTNode[] yysv;
    private j0beron.ast.ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new j0beron.ast.ASTNode[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case MODULE:
                            yyn = 2;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 332;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case IDENT:
                            yyn = 3;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case ';':
                            yyn = 4;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case CONST:
                            yyn = 7;
                            continue;
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr62();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case TYPE:
                            yyn = 9;
                            continue;
                        case VAR:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr67();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case BEGIN:
                            yyn = 11;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case IDENT:
                            yyn = 14;
                            continue;
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr64();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case VAR:
                            yyn = 16;
                            continue;
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr72();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case IDENT:
                            yyn = 19;
                            continue;
                        case VAR:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr69();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case END:
                            yyn = 20;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case IDENT:
                            yyn = 14;
                            continue;
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr64();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr61();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case '=':
                            yyn = 27;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case PROCEDURE:
                            yyn = 30;
                            continue;
                        case BEGIN:
                            yyn = yyr77();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr74();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case IDENT:
                            yyn = 19;
                            continue;
                        case VAR:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr69();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case VAR:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr66();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case '=':
                            yyn = 36;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case IDENT:
                            yyn = 37;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ';':
                            yyn = 38;
                            continue;
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case END:
                            yyn = yyr59();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr63();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case PROCEDURE:
                            yyn = 30;
                            continue;
                        case BEGIN:
                            yyn = yyr77();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case BEGIN:
                            yyn = yyr78();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case IDENT:
                            yyn = 56;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case ':':
                            yyn = 57;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr74();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr71();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    switch (yytok) {
                        case ',':
                            yyn = 59;
                            continue;
                        case ':':
                            yyn = yyr51();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case VAR:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr68();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case '.':
                            yyn = 66;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    switch (yytok) {
                        case BECOMES:
                            yyn = 69;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    switch (yytok) {
                        case IDENT:
                            yyn = 73;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case THEN:
                            yyn = 75;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    switch (yytok) {
                        case DO:
                            yyn = 94;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    switch (yytok) {
                        case ';':
                            yyn = 95;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    switch (yytok) {
                        case BEGIN:
                            yyn = yyr76();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    switch (yytok) {
                        case '(':
                            yyn = 97;
                            continue;
                        case ';':
                            yyn = yyr58();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    switch (yytok) {
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr73();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    switch (yytok) {
                        case ';':
                            yyn = 100;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ')':
                            yyn = yyr44();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ')':
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ')':
                            yyn = yyr43();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr79();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    switch (yytok) {
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    switch (yytok) {
                        case ',':
                            yyn = 106;
                            continue;
                        case ')':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    switch (yytok) {
                        case ')':
                            yyn = 107;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    switch (yytok) {
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    switch (yytok) {
                        case ')':
                            yyn = 123;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    switch (yytok) {
                        case VAR:
                        case TYPE:
                        case IDENT:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr65();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    switch (yytok) {
                        case ';':
                            yyn = 125;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                        case VAR:
                            yyn = 129;
                            continue;
                        case ')':
                            yyn = 130;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    switch (yytok) {
                        case ';':
                            yyn = 131;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    switch (yytok) {
                        case ':':
                            yyn = yyr50();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case VAR:
                        case IDENT:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr70();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case OF:
                            yyn = 132;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    switch (yytok) {
                        case ';':
                            yyn = 133;
                            continue;
                        case END:
                            yyn = yyr49();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    switch (yytok) {
                        case END:
                            yyn = 134;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    switch (yytok) {
                        case ':':
                            yyn = 135;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    switch (yytok) {
                        case ELSIF:
                            yyn = 139;
                            continue;
                        case END:
                        case ELSE:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    switch (yytok) {
                        case END:
                            yyn = 140;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    switch (yytok) {
                        case CONST:
                            yyn = 7;
                            continue;
                        case VAR:
                        case TYPE:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr62();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    switch (yytok) {
                        case ';':
                            yyn = 142;
                            continue;
                        case ')':
                            yyn = yyr55();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    switch (yytok) {
                        case ')':
                            yyn = 143;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    switch (yytok) {
                        case ':':
                            yyn = 144;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    switch (yytok) {
                        case ';':
                            yyn = yyr56();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    switch (yytok) {
                        case IDENT:
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr75();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ')':
                            yyn = yyr46();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    switch (yytok) {
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    switch (yytok) {
                        case ELSIF:
                            yyn = 139;
                            continue;
                        case END:
                        case ELSE:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    switch (yytok) {
                        case ELSE:
                            yyn = 151;
                            continue;
                        case END:
                            yyn = 152;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 306:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 307:
                    switch (yytok) {
                        case BEGIN:
                            yyn = 11;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 308:
                    switch (yytok) {
                        case IDENT:
                            yyn = 34;
                            continue;
                        case VAR:
                            yyn = 129;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 309:
                    switch (yytok) {
                        case ';':
                            yyn = yyr57();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 310:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 311:
                    switch (yytok) {
                        case ':':
                            yyn = 157;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 312:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ')':
                            yyn = yyr45();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 313:
                    switch (yytok) {
                        case END:
                            yyn = yyr48();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 314:
                    switch (yytok) {
                        case ';':
                        case END:
                            yyn = yyr47();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 315:
                    switch (yytok) {
                        case END:
                        case ELSE:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 316:
                    switch (yytok) {
                        case END:
                            yyn = 158;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 317:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 318:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 319:
                    switch (yytok) {
                        case THEN:
                            yyn = 160;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 320:
                    switch (yytok) {
                        case END:
                            yyn = 161;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 321:
                    switch (yytok) {
                        case ')':
                            yyn = yyr54();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 322:
                    switch (yytok) {
                        case ';':
                        case ')':
                            yyn = yyr52();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 323:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 61;
                            continue;
                        case BOOLEAN:
                            yyn = 62;
                            continue;
                        case IDENT:
                            yyn = 63;
                            continue;
                        case INTEGER:
                            yyn = 64;
                            continue;
                        case RECORD:
                            yyn = 65;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 324:
                    switch (yytok) {
                        case ';':
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 325:
                    switch (yytok) {
                        case END:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 326:
                    switch (yytok) {
                        case IDENT:
                            yyn = 23;
                            continue;
                        case IF:
                            yyn = 24;
                            continue;
                        case WHILE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 327:
                    switch (yytok) {
                        case IDENT:
                            yyn = 164;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 328:
                    switch (yytok) {
                        case ';':
                        case ')':
                            yyn = yyr53();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 329:
                    switch (yytok) {
                        case END:
                        case ELSIF:
                        case ELSE:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 330:
                    switch (yytok) {
                        case ';':
                            yyn = 165;
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 331:
                    switch (yytok) {
                        case BEGIN:
                        case PROCEDURE:
                            yyn = yyr60();
                            continue;
                    }
                    yyn = 335;
                    continue;

                case 332:
                    return true;
                case 333:
                    yyerror("stack overflow");
                case 334:
                    return false;
                case 335:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        j0beron.ast.ASTNode[] newyysv = new j0beron.ast.ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys23() {
        switch (yytok) {
            case '(':
                return 42;
            case '.':
                return 43;
            case '[':
                return 44;
            case ';':
            case END:
            case ELSIF:
            case ELSE:
                return yyr6();
            case BECOMES:
                return yyr4();
        }
        return 335;
    }

    private int yys24() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys25() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys27() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys40() {
        switch (yytok) {
            case TILDE:
            case UMIN:
            case TYPE:
            case error:
            case BEGIN:
            case UPLUS:
            case PROCEDURE:
            case WHILE:
            case ENDINPUT:
            case INTEGER:
            case IDENT:
            case IF:
            case INT:
            case VAR:
            case ARRAY:
            case RECORD:
            case CONST:
            case ':':
            case MODULE:
            case '~':
            case '(':
            case BOOLEAN:
                return 335;
            case '.':
                return 43;
            case '[':
                return 44;
        }
        return yyr4();
    }

    private int yys42() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
            case ')':
                return yyr7();
        }
        return 335;
    }

    private int yys44() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys46() {
        switch (yytok) {
            case DIV:
                return 76;
            case GEQ:
                return 77;
            case LEQ:
                return 78;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '#':
                return 81;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case '<':
                return 86;
            case '=':
                return 87;
            case '>':
                return 88;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr41();
        }
        return 335;
    }

    private int yys47() {
        switch (yytok) {
            case '.':
                return 43;
            case '[':
                return 44;
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr4();
        }
        return 335;
    }

    private int yys48() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr32();
        }
        return 335;
    }

    private int yys49() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys50() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys51() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys52() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys61() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys68() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case ')':
            case '=':
            case MOD:
            case '&':
            case ']':
            case LEQ:
            case ELSE:
            case BECOMES:
                return yyr3();
        }
        return 335;
    }

    private int yys69() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys73() {
        switch (yytok) {
            case UPLUS:
            case TILDE:
            case '~':
            case VAR:
            case BEGIN:
            case TYPE:
            case PROCEDURE:
            case MODULE:
            case BOOLEAN:
            case WHILE:
            case IDENT:
            case IF:
            case INT:
            case UMIN:
            case ARRAY:
            case RECORD:
            case ':':
            case CONST:
            case ENDINPUT:
            case '(':
            case INTEGER:
            case error:
                return 335;
        }
        return yyr1();
    }

    private int yys74() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case ']':
                return 108;
        }
        return 335;
    }

    private int yys76() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys77() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys78() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys79() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys80() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys81() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys82() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys83() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys84() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys85() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys86() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys87() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys88() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys89() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr33();
        }
        return 335;
    }

    private int yys91() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr23();
        }
        return 335;
    }

    private int yys92() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr24();
        }
        return 335;
    }

    private int yys93() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr22();
        }
        return 335;
    }

    private int yys105() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case ';':
            case END:
            case ELSIF:
            case ELSE:
                return yyr11();
        }
        return 335;
    }

    private int yys106() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yys108() {
        switch (yytok) {
            case UPLUS:
            case TILDE:
            case '~':
            case VAR:
            case BEGIN:
            case TYPE:
            case PROCEDURE:
            case MODULE:
            case BOOLEAN:
            case WHILE:
            case IDENT:
            case IF:
            case INT:
            case UMIN:
            case ARRAY:
            case RECORD:
            case ':':
            case CONST:
            case ENDINPUT:
            case '(':
            case INTEGER:
            case error:
                return 335;
        }
        return yyr2();
    }

    private int yys110() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr26();
        }
        return 335;
    }

    private int yys111() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr39();
        }
        return 335;
    }

    private int yys112() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr40();
        }
        return 335;
    }

    private int yys113() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr27();
        }
        return 335;
    }

    private int yys114() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr31();
        }
        return 335;
    }

    private int yys115() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr36();
        }
        return 335;
    }

    private int yys116() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr28();
        }
        return 335;
    }

    private int yys117() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr25();
        }
        return 335;
    }

    private int yys118() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr29();
        }
        return 335;
    }

    private int yys119() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case '&':
                return 82;
            case '*':
                return 83;
            case '#':
            case DO:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '=':
            case '+':
            case ELSIF:
            case ']':
            case ')':
            case LEQ:
            case ELSE:
                return yyr30();
        }
        return 335;
    }

    private int yys120() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr38();
        }
        return 335;
    }

    private int yys121() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr35();
        }
        return 335;
    }

    private int yys122() {
        switch (yytok) {
            case DIV:
                return 76;
            case MOD:
                return 79;
            case OR:
                return 80;
            case '&':
                return 82;
            case '*':
                return 83;
            case '+':
                return 84;
            case '-':
                return 85;
            case DO:
            case THEN:
            case ';':
            case OF:
            case ',':
            case ')':
                return yyr37();
        }
        return 335;
    }

    private int yys123() {
        switch (yytok) {
            case '#':
            case DO:
            case DIV:
            case THEN:
            case '>':
            case GEQ:
            case '<':
            case ';':
            case OR:
            case END:
            case '-':
            case OF:
            case ',':
            case '+':
            case ELSIF:
            case '*':
            case '=':
            case ')':
            case MOD:
            case ']':
            case '&':
            case LEQ:
            case ELSE:
                return yyr34();
        }
        return 335;
    }

    private int yys139() {
        switch (yytok) {
            case IDENT:
                return 47;
            case INT:
                return 48;
            case '(':
                return 49;
            case '+':
                return 50;
            case '-':
                return 51;
            case '~':
                return 52;
        }
        return 335;
    }

    private int yyr79() { // module : MODULE IDENT ';' decls body END IDENT '.'
        { result = new Module(((Ident)yysv[yysp-7]), ((Decls)yysv[yysp-5]), ((Body)yysv[yysp-4]));}
        yysv[yysp-=8] = yyrv;
        return 1;
    }

    private int yyr59() { // body : BEGIN stats
        { yyrv = new Body(((Stats)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        switch (yyst[yysp-1]) {
            case 6: return 10;
            default: return 154;
        }
    }

    private int yyr35() { // comp : expr '=' expr
        { yyrv = new Eq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr36() { // comp : expr '#' expr
        { yyrv = new NEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr37() { // comp : expr '>' expr
        { yyrv = new GT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr38() { // comp : expr '<' expr
        { yyrv = new LT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr39() { // comp : expr GEQ expr
        { yyrv = new GEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr40() { // comp : expr LEQ expr
        { yyrv = new LEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr41() { // comp : expr
        { yyrv = ((Expr)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypcomp();
    }

    private int yypcomp() {
        switch (yyst[yysp-1]) {
            case 139: return 153;
            case 61: return 101;
            case 49: return 90;
            case 27: return 54;
            case 25: return 53;
            case 24: return 45;
            default: return 70;
        }
    }

    private int yyr65() { // constdecl : IDENT '=' comp ';'
        { yyrv = new ConstDecl(((Ident)yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 12;
    }

    private int yyr63() { // constdecls : constdecl constdecls
        { yyrv = new ConstDecls(((ConstDecl)yysv[yysp-2]), ((ConstDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypconstdecls();
    }

    private int yyr64() { // constdecls : /* empty */
        { yyrv = new ConstDecls(); }
        yysv[yysp-=0] = yyrv;
        return yypconstdecls();
    }

    private int yypconstdecls() {
        switch (yyst[yysp-1]) {
            case 7: return 13;
            default: return 26;
        }
    }

    private int yyr61() { // constsect : CONST constdecls
        { yyrv = new ConstSect(((ConstDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr62() { // constsect : /* empty */
        { yyrv = new ConstSect(); }
        yysv[yysp-=0] = yyrv;
        return 5;
    }

    private int yyr78() { // decls : constsect typesect varsect procs
        { yyrv = new Decls(((ConstSect)yysv[yysp-4]), ((TypeSect)yysv[yysp-3]), ((VarSect)yysv[yysp-2]), ((Procs)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 4: return 6;
            default: return 141;
        }
    }

    private int yyr19() { // else : ELSE stats
        { yyrv = new Else(((Stats)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 150;
    }

    private int yyr18() { // elsif : ELSIF comp THEN stats
        { yyrv = new ElsIf(((Expr)yysv[yysp-3]), ((Stats)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 137;
    }

    private int yyr16() { // elsifs : elsif elsifs
        { yyrv = new ElsIfs(((ElsIf)yysv[yysp-2]), ((ElsIfs)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypelsifs();
    }

    private int yyr17() { // elsifs : /* empty */
        { yyrv = new ElsIfs(); }
        yysv[yysp-=0] = yyrv;
        return yypelsifs();
    }

    private int yypelsifs() {
        switch (yyst[yysp-1]) {
            case 109: return 138;
            default: return 149;
        }
    }

    private int yyr22() { // expr : '~' expr
        { yyrv = new Not(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : '+' expr
        { yyrv = new Pos(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : '-' expr
        { yyrv = new Neg(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr25() { // expr : expr '*' expr
        { yyrv = new Mul(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr26() { // expr : expr DIV expr
        { yyrv = new Div(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : expr MOD expr
        { yyrv = new Mod(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr28() { // expr : expr '&' expr
        { yyrv = new And(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr29() { // expr : expr '+' expr
        { yyrv = new Add(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr30() { // expr : expr '-' expr
        { yyrv = new Sub(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr31() { // expr : expr OR expr
        { yyrv = new Or(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr32() { // expr : INT
        { yyrv = ((Int)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr33() { // expr : IDENT selectors
        { yyrv = new Lookup(((Ident)yysv[yysp-2]), ((Selectors)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr34() { // expr : '(' comp ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 88: return 122;
            case 87: return 121;
            case 86: return 120;
            case 85: return 119;
            case 84: return 118;
            case 83: return 117;
            case 82: return 116;
            case 81: return 115;
            case 80: return 114;
            case 79: return 113;
            case 78: return 112;
            case 77: return 111;
            case 76: return 110;
            case 69: return 105;
            case 52: return 93;
            case 51: return 92;
            case 50: return 91;
            case 44: return 74;
            default: return 46;
        }
    }

    private int yyr7() { // exprs : /* empty */
        { yyrv = new Exprs(); }
        yysv[yysp-=0] = yyrv;
        return 71;
    }

    private int yyr8() { // exprs : exprs1
        { yyrv = new Exprs(((Exprs)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 71;
    }

    private int yyr9() { // exprs1 : comp
        { yyrv = new Exprs(((Expr)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypexprs1();
    }

    private int yyr10() { // exprs1 : comp ',' exprs1
        { yyrv = new Exprs(((Expr)yysv[yysp-3]), ((Exprs)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexprs1();
    }

    private int yypexprs1() {
        switch (yyst[yysp-1]) {
            case 42: return 72;
            default: return 136;
        }
    }

    private int yyr47() { // field : idents ':' type
        { yyrv = new Field(((Idents)yysv[yysp-3]), ((Type)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 102;
    }

    private int yyr48() { // fields : field ';' fields
        { yyrv = new Fields(((Field)yysv[yysp-3]), ((Fields)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfields();
    }

    private int yyr49() { // fields : field
        { yyrv = new Fields(((Field)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfields();
    }

    private int yypfields() {
        switch (yyst[yysp-1]) {
            case 65: return 103;
            default: return 147;
        }
    }

    private int yyr56() { // formals : '(' ')'
        { yyrv = new Formals(); }
        yysv[yysp-=2] = yyrv;
        return 96;
    }

    private int yyr57() { // formals : '(' fpsects ')'
        { yyrv = new Formals(((FPSects)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 96;
    }

    private int yyr58() { // formals : /* empty */
        { yyrv = new Formals(); }
        yysv[yysp-=0] = yyrv;
        return 96;
    }

    private int yyr52() { // fpsect : idents ':' type
        { yyrv = new FPSect(false, ((Idents)yysv[yysp-3]), ((Type)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 126;
    }

    private int yyr53() { // fpsect : VAR idents ':' type
        { yyrv = new FPSect(true, ((Idents)yysv[yysp-3]), ((Type)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 126;
    }

    private int yyr54() { // fpsects : fpsect ';' fpsects
        { yyrv = new FPSects(((FPSect)yysv[yysp-3]), ((FPSects)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfpsects();
    }

    private int yyr55() { // fpsects : fpsect
        { yyrv = new FPSects(((FPSect)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfpsects();
    }

    private int yypfpsects() {
        switch (yyst[yysp-1]) {
            case 97: return 127;
            default: return 155;
        }
    }

    private int yyr50() { // idents : IDENT ',' idents
        { yyrv = new Idents(((Ident)yysv[yysp-3]), ((Idents)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypidents();
    }

    private int yyr51() { // idents : IDENT
        { yyrv = new Idents(((Ident)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypidents();
    }

    private int yypidents() {
        switch (yyst[yysp-1]) {
            case 133: return 104;
            case 129: return 145;
            case 65: return 104;
            case 59: return 99;
            case 32: return 31;
            case 16: return 31;
            default: return 128;
        }
    }

    private int yyr5() { // actuals : '(' exprs ')'
        { yyrv = new Actuals(((Exprs)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 39;
    }

    private int yyr6() { // actuals : /* empty */
        { yyrv = new Actuals(); }
        yysv[yysp-=0] = yyrv;
        return 39;
    }

    private int yyr60() { // proc : PROCEDURE IDENT formals ';' decls body END IDENT ';'
        { yyrv = new Proc(((Ident)yysv[yysp-8]), ((Formals)yysv[yysp-7]), ((Decls)yysv[yysp-5]), ((Body)yysv[yysp-4])); }
        yysv[yysp-=9] = yyrv;
        return 28;
    }

    private int yyr76() { // procs : proc procs
        { yyrv = new Procs(((Proc)yysv[yysp-2]), ((Procs)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypprocs();
    }

    private int yyr77() { // procs : /* empty */
        { yyrv = new Procs(); }
        yysv[yysp-=0] = yyrv;
        return yypprocs();
    }

    private int yypprocs() {
        switch (yyst[yysp-1]) {
            case 15: return 29;
            default: return 55;
        }
    }

    private int yyr1() { // selector : '.' IDENT
        { yyrv = new Member(((Ident)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 40;
    }

    private int yyr2() { // selector : '[' expr ']'
        { yyrv = new Subscript(((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return 40;
    }

    private int yyr3() { // selectors : selector selectors
        { yyrv = new Selectors(((Selector)yysv[yysp-2]), ((Selectors)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypselectors();
    }

    private int yyr4() { // selectors : /* empty */
        { yyrv = new Selectors(); }
        yysv[yysp-=0] = yyrv;
        return yypselectors();
    }

    private int yypselectors() {
        switch (yyst[yysp-1]) {
            case 40: return 68;
            case 23: return 41;
            default: return 89;
        }
    }

    private int yyr11() { // stat : IDENT selectors BECOMES expr
        { yyrv = new Assign(((Ident)yysv[yysp-4]), ((Selectors)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 21;
    }

    private int yyr12() { // stat : IDENT actuals
        { yyrv = new Call(((Ident)yysv[yysp-2]), ((Actuals)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 21;
    }

    private int yyr13() { // stat : IF comp THEN stats elsifs else END
        { yyrv = new IfThenElse(((Expr)yysv[yysp-6]), ((Stats)yysv[yysp-4]), ((ElsIfs)yysv[yysp-3]), ((Else)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 21;
    }

    private int yyr14() { // stat : IF comp THEN stats elsifs END
        { yyrv = new IfThenElse(((Expr)yysv[yysp-5]), ((Stats)yysv[yysp-3]), ((ElsIfs)yysv[yysp-2])); }
        yysv[yysp-=6] = yyrv;
        return 21;
    }

    private int yyr15() { // stat : WHILE comp DO stats END
        { yyrv = new WhileDo(((Expr)yysv[yysp-4]), ((Stats)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 21;
    }

    private int yyr20() { // stats : stat ';' stats
        { yyrv = new Stats(((Stat)yysv[yysp-3]), ((Stats)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypstats();
    }

    private int yyr21() { // stats : stat
        { yyrv = new Stats(((Stat)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypstats();
    }

    private int yypstats() {
        switch (yyst[yysp-1]) {
            case 151: return 159;
            case 94: return 124;
            case 75: return 109;
            case 38: return 67;
            case 11: return 22;
            default: return 163;
        }
    }

    private int yyr42() { // type : IDENT
        { yyrv = new User(((Ident)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr43() { // type : INTEGER
        { yyrv = new IntType(); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr44() { // type : BOOLEAN
        { yyrv = new BoolType(); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr45() { // type : ARRAY comp OF type
        { yyrv = new Array(((Expr)yysv[yysp-3]), ((Type)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return yyptype();
    }

    private int yyr46() { // type : RECORD fields END
        { yyrv = new Record(((Fields)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yyptype();
    }

    private int yyptype() {
        switch (yyst[yysp-1]) {
            case 144: return 156;
            case 135: return 148;
            case 132: return 146;
            case 57: return 98;
            case 36: return 60;
            default: return 162;
        }
    }

    private int yyr70() { // typedecl : IDENT '=' type ';'
        { yyrv = new TypeDecl(((Ident)yysv[yysp-4]), ((Type)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 17;
    }

    private int yyr68() { // typedecls : typedecl typedecls
        { yyrv = new TypeDecls(((TypeDecl)yysv[yysp-2]), ((TypeDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yyptypedecls();
    }

    private int yyr69() { // typedecls : /* empty */
        { yyrv = new TypeDecls(); }
        yysv[yysp-=0] = yyrv;
        return yyptypedecls();
    }

    private int yyptypedecls() {
        switch (yyst[yysp-1]) {
            case 9: return 18;
            default: return 35;
        }
    }

    private int yyr66() { // typesect : TYPE typedecls
        { yyrv = new TypeSect(((TypeDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 8;
    }

    private int yyr67() { // typesect : /* empty */
        { yyrv = new TypeSect(); }
        yysv[yysp-=0] = yyrv;
        return 8;
    }

    private int yyr75() { // vardecl : idents ':' type ';'
        { yyrv = new VarDecl(((Idents)yysv[yysp-4]), ((Type)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 32;
    }

    private int yyr73() { // vardecls : vardecl vardecls
        { yyrv = new VarDecls(((VarDecl)yysv[yysp-2]), ((VarDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypvardecls();
    }

    private int yyr74() { // vardecls : /* empty */
        { yyrv = new VarDecls(); }
        yysv[yysp-=0] = yyrv;
        return yypvardecls();
    }

    private int yypvardecls() {
        switch (yyst[yysp-1]) {
            case 16: return 33;
            default: return 58;
        }
    }

    private int yyr71() { // varsect : VAR vardecls
        { yyrv = new VarSect(((VarDecls)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr72() { // varsect : /* empty */
        { yyrv = new VarSect(); }
        yysv[yysp-=0] = yyrv;
        return 15;
    }

    protected String[] yyerrmsgs = {
    };

private Oberon0Lexer lexer; 

private Module result;

public Module getResult() {
  return result;
}

public Oberon0Parser(Oberon0Lexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
