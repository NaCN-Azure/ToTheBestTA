package com.androlua;

public enum LuaTokenTypes
{
  static
  {
    NEW_LINE = new LuaTokenTypes("NEW_LINE", 1);
    WHITE_SPACE = new LuaTokenTypes("WHITE_SPACE", 2);
    BAD_CHARACTER = new LuaTokenTypes("BAD_CHARACTER", 3);
    NAME = new LuaTokenTypes("NAME", 4);
    NUMBER = new LuaTokenTypes("NUMBER", 5);
    PLUS = new LuaTokenTypes("PLUS", 6);
    DOT = new LuaTokenTypes("DOT", 7);
    MINUS = new LuaTokenTypes("MINUS", 8);
    LBRACK = new LuaTokenTypes("LBRACK", 9);
    ASSIGN = new LuaTokenTypes("ASSIGN", 10);
    RBRACK = new LuaTokenTypes("RBRACK", 11);
    GETN = new LuaTokenTypes("GETN", 12);
    NOT = new LuaTokenTypes("NOT", 13);
    GT = new LuaTokenTypes("GT", 14);
    LT = new LuaTokenTypes("LT", 15);
    BIT_TILDE = new LuaTokenTypes("BIT_TILDE", 16);
    MULT = new LuaTokenTypes("MULT", 17);
    MOD = new LuaTokenTypes("MOD", 18);
    DIV = new LuaTokenTypes("DIV", 19);
    LPAREN = new LuaTokenTypes("LPAREN", 20);
    RPAREN = new LuaTokenTypes("RPAREN", 21);
    LCURLY = new LuaTokenTypes("LCURLY", 22);
    RCURLY = new LuaTokenTypes("RCURLY", 23);
    COMMA = new LuaTokenTypes("COMMA", 24);
    SEMI = new LuaTokenTypes("SEMI", 25);
    COLON = new LuaTokenTypes("COLON", 26);
    EXP = new LuaTokenTypes("EXP", 27);
    BIT_AND = new LuaTokenTypes("BIT_AND", 28);
    BIT_OR = new LuaTokenTypes("BIT_OR", 29);
    STRING = new LuaTokenTypes("STRING", 30);
    LONG_STRING = new LuaTokenTypes("LONG_STRING", 31);
    CONCAT = new LuaTokenTypes("CONCAT", 32);
    IN = new LuaTokenTypes("IN", 33);
    IF = new LuaTokenTypes("IF", 34);
    OR = new LuaTokenTypes("OR", 35);
    DO = new LuaTokenTypes("DO", 36);
    EQ = new LuaTokenTypes("EQ", 37);
    SHEBANG = new LuaTokenTypes("SHEBANG", 38);
    NE = new LuaTokenTypes("NE", 39);
    GE = new LuaTokenTypes("GE", 40);
    BIT_RTRT = new LuaTokenTypes("BIT_RTRT", 41);
    LE = new LuaTokenTypes("LE", 42);
    BIT_LTLT = new LuaTokenTypes("BIT_LTLT", 43);
    DOUBLE_DIV = new LuaTokenTypes("DOUBLE_DIV", 44);
    DOUBLE_COLON = new LuaTokenTypes("DOUBLE_COLON", 45);
    AND = new LuaTokenTypes("AND", 46);
    SHORT_COMMENT = new LuaTokenTypes("SHORT_COMMENT", 47);
    ELLIPSIS = new LuaTokenTypes("ELLIPSIS", 48);
    END = new LuaTokenTypes("END", 49);
    NIL = new LuaTokenTypes("NIL", 50);
    LEF = new LuaTokenTypes("LEF", 51);
    MEAN = new LuaTokenTypes("MEAN", 52);
    FOR = new LuaTokenTypes("FOR", 53);
    DOC_COMMENT = new LuaTokenTypes("DOC_COMMENT", 54);
    ELSE = new LuaTokenTypes("ELSE", 55);
    GOTO = new LuaTokenTypes("GOTO", 56);
    CASE = new LuaTokenTypes("CASE", 57);
    TRUE = new LuaTokenTypes("TRUE", 58);
    THEN = new LuaTokenTypes("THEN", 59);
    BLOCK_COMMENT = new LuaTokenTypes("BLOCK_COMMENT", 60);
    BREAK = new LuaTokenTypes("BREAK", 61);
    LOCAL = new LuaTokenTypes("LOCAL", 62);
    FALSE = new LuaTokenTypes("FALSE", 63);
    UNTIL = new LuaTokenTypes("UNTIL", 64);
    WHILE = new LuaTokenTypes("WHILE", 65);
    RETURN = new LuaTokenTypes("RETURN", 66);
    REPEAT = new LuaTokenTypes("REPEAT", 67);
    ELSEIF = new LuaTokenTypes("ELSEIF", 68);
    CONTINUE = new LuaTokenTypes("CONTINUE", 69);
    SWITCH = new LuaTokenTypes("SWITCH", 70);
    DEFAULT = new LuaTokenTypes("DEFAULT", 71);
    REGION = new LuaTokenTypes("REGION", 72);
    FUNCTION = new LuaTokenTypes("FUNCTION", 73);
    ENDREGION = new LuaTokenTypes("ENDREGION", 74);
    LABEL = new LuaTokenTypes("LABEL", 75);
    AT = new LuaTokenTypes("AT", 76);
    DEFER = new LuaTokenTypes("DEFER", 77);
    WHEN = new LuaTokenTypes("WHEN", 78);
    LAMBDA = new LuaTokenTypes("LAMBDA", 79);
    LuaTokenTypes[] arrayOfLuaTokenTypes = new LuaTokenTypes[80];
    arrayOfLuaTokenTypes[0] = SHEBANG_CONTENT;
    arrayOfLuaTokenTypes[1] = NEW_LINE;
    arrayOfLuaTokenTypes[2] = WHITE_SPACE;
    arrayOfLuaTokenTypes[3] = BAD_CHARACTER;
    arrayOfLuaTokenTypes[4] = NAME;
    arrayOfLuaTokenTypes[5] = NUMBER;
    arrayOfLuaTokenTypes[6] = PLUS;
    arrayOfLuaTokenTypes[7] = DOT;
    arrayOfLuaTokenTypes[8] = MINUS;
    arrayOfLuaTokenTypes[9] = LBRACK;
    arrayOfLuaTokenTypes[10] = ASSIGN;
    arrayOfLuaTokenTypes[11] = RBRACK;
    arrayOfLuaTokenTypes[12] = GETN;
    arrayOfLuaTokenTypes[13] = NOT;
    arrayOfLuaTokenTypes[14] = GT;
    arrayOfLuaTokenTypes[15] = LT;
    arrayOfLuaTokenTypes[16] = BIT_TILDE;
    arrayOfLuaTokenTypes[17] = MULT;
    arrayOfLuaTokenTypes[18] = MOD;
    arrayOfLuaTokenTypes[19] = DIV;
    arrayOfLuaTokenTypes[20] = LPAREN;
    arrayOfLuaTokenTypes[21] = RPAREN;
    arrayOfLuaTokenTypes[22] = LCURLY;
    arrayOfLuaTokenTypes[23] = RCURLY;
    arrayOfLuaTokenTypes[24] = COMMA;
    arrayOfLuaTokenTypes[25] = SEMI;
    arrayOfLuaTokenTypes[26] = COLON;
    arrayOfLuaTokenTypes[27] = EXP;
    arrayOfLuaTokenTypes[28] = BIT_AND;
    arrayOfLuaTokenTypes[29] = BIT_OR;
    arrayOfLuaTokenTypes[30] = STRING;
    arrayOfLuaTokenTypes[31] = LONG_STRING;
    arrayOfLuaTokenTypes[32] = CONCAT;
    arrayOfLuaTokenTypes[33] = IN;
    arrayOfLuaTokenTypes[34] = IF;
    arrayOfLuaTokenTypes[35] = OR;
    arrayOfLuaTokenTypes[36] = DO;
    arrayOfLuaTokenTypes[37] = EQ;
    arrayOfLuaTokenTypes[38] = SHEBANG;
    arrayOfLuaTokenTypes[39] = NE;
    arrayOfLuaTokenTypes[40] = GE;
    arrayOfLuaTokenTypes[41] = BIT_RTRT;
    arrayOfLuaTokenTypes[42] = LE;
    arrayOfLuaTokenTypes[43] = BIT_LTLT;
    arrayOfLuaTokenTypes[44] = DOUBLE_DIV;
    arrayOfLuaTokenTypes[45] = DOUBLE_COLON;
    arrayOfLuaTokenTypes[46] = AND;
    arrayOfLuaTokenTypes[47] = SHORT_COMMENT;
    arrayOfLuaTokenTypes[48] = ELLIPSIS;
    arrayOfLuaTokenTypes[49] = END;
    arrayOfLuaTokenTypes[50] = NIL;
    arrayOfLuaTokenTypes[51] = LEF;
    arrayOfLuaTokenTypes[52] = MEAN;
    arrayOfLuaTokenTypes[53] = FOR;
    arrayOfLuaTokenTypes[54] = DOC_COMMENT;
    arrayOfLuaTokenTypes[55] = ELSE;
    arrayOfLuaTokenTypes[56] = GOTO;
    arrayOfLuaTokenTypes[57] = CASE;
    arrayOfLuaTokenTypes[58] = TRUE;
    arrayOfLuaTokenTypes[59] = THEN;
    arrayOfLuaTokenTypes[60] = BLOCK_COMMENT;
    arrayOfLuaTokenTypes[61] = BREAK;
    arrayOfLuaTokenTypes[62] = LOCAL;
    arrayOfLuaTokenTypes[63] = FALSE;
    arrayOfLuaTokenTypes[64] = UNTIL;
    arrayOfLuaTokenTypes[65] = WHILE;
    arrayOfLuaTokenTypes[66] = RETURN;
    arrayOfLuaTokenTypes[67] = REPEAT;
    arrayOfLuaTokenTypes[68] = ELSEIF;
    arrayOfLuaTokenTypes[69] = CONTINUE;
    arrayOfLuaTokenTypes[70] = SWITCH;
    arrayOfLuaTokenTypes[71] = DEFAULT;
    arrayOfLuaTokenTypes[72] = REGION;
    arrayOfLuaTokenTypes[73] = FUNCTION;
    arrayOfLuaTokenTypes[74] = ENDREGION;
    arrayOfLuaTokenTypes[75] = LABEL;
    arrayOfLuaTokenTypes[76] = AT;
    arrayOfLuaTokenTypes[77] = DEFER;
    arrayOfLuaTokenTypes[78] = WHEN;
    arrayOfLuaTokenTypes[79] = LAMBDA;
    a = arrayOfLuaTokenTypes;
  }
  
  private LuaTokenTypes() {}
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\com\androlua\LuaTokenTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */