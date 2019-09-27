package bsh;

public abstract interface ParserConstants
{
  public static final int ABSTRACT = 10;
  public static final int ANDASSIGN = 122;
  public static final int ANDASSIGNX = 123;
  public static final int ASSIGN = 81;
  public static final int BANG = 86;
  public static final int BIT_AND = 106;
  public static final int BIT_ANDX = 107;
  public static final int BIT_OR = 108;
  public static final int BIT_ORX = 109;
  public static final int BOOLEAN = 11;
  public static final int BOOL_AND = 98;
  public static final int BOOL_ANDX = 99;
  public static final int BOOL_OR = 96;
  public static final int BOOL_ORX = 97;
  public static final int BREAK = 12;
  public static final int BYTE = 14;
  public static final int CASE = 15;
  public static final int CATCH = 16;
  public static final int CHAR = 17;
  public static final int CHARACTER_LITERAL = 66;
  public static final int CLASS = 13;
  public static final int COLON = 89;
  public static final int COMMA = 79;
  public static final int CONST = 18;
  public static final int CONTINUE = 19;
  public static final int DECIMAL_LITERAL = 61;
  public static final int DECR = 101;
  public static final int DEFAULT = 0;
  public static final int DIGIT = 71;
  public static final int DO = 21;
  public static final int DOT = 80;
  public static final int DOUBLE = 22;
  public static final int ELSE = 23;
  public static final int ENUM = 24;
  public static final int EOF = 0;
  public static final int EQ = 90;
  public static final int EXPONENT = 65;
  public static final int EXTENDS = 25;
  public static final int FALSE = 26;
  public static final int FINAL = 27;
  public static final int FINALLY = 28;
  public static final int FLOAT = 29;
  public static final int FLOATING_POINT_LITERAL = 64;
  public static final int FOR = 30;
  public static final int FORMAL_COMMENT = 68;
  public static final int GE = 93;
  public static final int GEX = 94;
  public static final int GOTO = 31;
  public static final int GT = 82;
  public static final int GTX = 83;
  public static final int HASH_BANG_COMMENT = 8;
  public static final int HEX_LITERAL = 62;
  public static final int HOOK = 88;
  public static final int IDENTIFIER = 69;
  public static final int IF = 32;
  public static final int IMPLEMENTS = 33;
  public static final int IMPORT = 34;
  public static final int INCR = 100;
  public static final int INSTANCEOF = 35;
  public static final int INT = 36;
  public static final int INTEGER_LITERAL = 60;
  public static final int INTERFACE = 37;
  public static final int LBRACE = 74;
  public static final int LBRACKET = 76;
  public static final int LE = 91;
  public static final int LETTER = 70;
  public static final int LEX = 92;
  public static final int LONG = 38;
  public static final int LPAREN = 72;
  public static final int LSHIFT = 112;
  public static final int LSHIFTASSIGN = 128;
  public static final int LSHIFTASSIGNX = 129;
  public static final int LSHIFTX = 113;
  public static final int LT = 84;
  public static final int LTX = 85;
  public static final int MINUS = 103;
  public static final int MINUSASSIGN = 119;
  public static final int MOD = 111;
  public static final int MODASSIGN = 127;
  public static final int MULTI_LINE_COMMENT = 9;
  public static final int NATIVE = 39;
  public static final int NE = 95;
  public static final int NEW = 40;
  public static final int NONPRINTABLE = 6;
  public static final int NULL = 41;
  public static final int OCTAL_LITERAL = 63;
  public static final int ORASSIGN = 124;
  public static final int ORASSIGNX = 125;
  public static final int PACKAGE = 42;
  public static final int PLUS = 102;
  public static final int PLUSASSIGN = 118;
  public static final int PRIVATE = 43;
  public static final int PROTECTED = 44;
  public static final int PUBLIC = 45;
  public static final int RBRACE = 75;
  public static final int RBRACKET = 77;
  public static final int RETURN = 46;
  public static final int RPAREN = 73;
  public static final int RSIGNEDSHIFT = 114;
  public static final int RSIGNEDSHIFTASSIGN = 130;
  public static final int RSIGNEDSHIFTASSIGNX = 131;
  public static final int RSIGNEDSHIFTX = 115;
  public static final int RUNSIGNEDSHIFT = 116;
  public static final int RUNSIGNEDSHIFTASSIGN = 132;
  public static final int RUNSIGNEDSHIFTASSIGNX = 133;
  public static final int RUNSIGNEDSHIFTX = 117;
  public static final int SEMICOLON = 78;
  public static final int SHORT = 47;
  public static final int SINGLE_LINE_COMMENT = 7;
  public static final int SLASH = 105;
  public static final int SLASHASSIGN = 121;
  public static final int STAR = 104;
  public static final int STARASSIGN = 120;
  public static final int STATIC = 48;
  public static final int STRICTFP = 49;
  public static final int STRING_LITERAL = 67;
  public static final int SWITCH = 50;
  public static final int SYNCHRONIZED = 51;
  public static final int THROW = 53;
  public static final int THROWS = 54;
  public static final int TILDE = 87;
  public static final int TRANSIENT = 52;
  public static final int TRUE = 55;
  public static final int TRY = 56;
  public static final int VOID = 57;
  public static final int VOLATILE = 58;
  public static final int WHILE = 59;
  public static final int XOR = 110;
  public static final int XORASSIGN = 126;
  public static final int _DEFAULT = 20;
  public static final String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\r\"", "\"\\f\"", "\"\\n\"", "<NONPRINTABLE>", "<SINGLE_LINE_COMMENT>", "<HASH_BANG_COMMENT>", "<MULTI_LINE_COMMENT>", "\"abstract\"", "\"boolean\"", "\"break\"", "\"class\"", "\"byte\"", "\"case\"", "\"catch\"", "\"char\"", "\"const\"", "\"continue\"", "\"default\"", "\"do\"", "\"double\"", "\"else\"", "\"enum\"", "\"extends\"", "\"false\"", "\"final\"", "\"finally\"", "\"float\"", "\"for\"", "\"goto\"", "\"if\"", "\"implements\"", "\"import\"", "\"instanceof\"", "\"int\"", "\"interface\"", "\"long\"", "\"native\"", "\"new\"", "\"null\"", "\"package\"", "\"private\"", "\"protected\"", "\"public\"", "\"return\"", "\"short\"", "\"static\"", "\"strictfp\"", "\"switch\"", "\"synchronized\"", "\"transient\"", "\"throw\"", "\"throws\"", "\"true\"", "\"try\"", "\"void\"", "\"volatile\"", "\"while\"", "<INTEGER_LITERAL>", "<DECIMAL_LITERAL>", "<HEX_LITERAL>", "<OCTAL_LITERAL>", "<FLOATING_POINT_LITERAL>", "<EXPONENT>", "<CHARACTER_LITERAL>", "<STRING_LITERAL>", "<FORMAL_COMMENT>", "<IDENTIFIER>", "<LETTER>", "<DIGIT>", "\"(\"", "\")\"", "\"{\"", "\"}\"", "\"[\"", "\"]\"", "\";\"", "\",\"", "\".\"", "\"=\"", "\">\"", "\"@gt\"", "\"<\"", "\"@lt\"", "\"!\"", "\"~\"", "\"?\"", "\":\"", "\"==\"", "\"<=\"", "\"@lteq\"", "\">=\"", "\"@gteq\"", "\"!=\"", "\"||\"", "\"@or\"", "\"&&\"", "\"@and\"", "\"++\"", "\"--\"", "\"+\"", "\"-\"", "\"*\"", "\"/\"", "\"&\"", "\"@bitwise_and\"", "\"|\"", "\"@bitwise_or\"", "\"^\"", "\"%\"", "\"<<\"", "\"@left_shift\"", "\">>\"", "\"@right_shift\"", "\">>>\"", "\"@right_unsigned_shift\"", "\"+=\"", "\"-=\"", "\"*=\"", "\"/=\"", "\"&=\"", "\"@and_assign\"", "\"|=\"", "\"@or_assign\"", "\"^=\"", "\"%=\"", "\"<<=\"", "\"@left_shift_assign\"", "\">>=\"", "\"@right_shift_assign\"", "\">>>=\"", "\"@right_unsigned_shift_assign\"" };
}


/* Location:              E:\程序\作业\送给最好的TA_dex2jar.jar!\bsh\ParserConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */