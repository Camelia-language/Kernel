// $ANTLR 3.1.1 CameliaLexer.g 2015-04-25 18:45:14
 package org.kernel.camelia.language;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CameliaLexer extends Lexer {
    public static final int CLASS=4;
    public static final int LT=36;
    public static final int DEF=5;
    public static final int WHILE=8;
    public static final int LETTER=51;
    public static final int MOD=42;
    public static final int ID_CHAR=22;
    public static final int FLOAT=17;
    public static final int NOT=45;
    public static final int AND=43;
    public static final int SPACE=49;
    public static final int EOF=-1;
    public static final int IF=6;
    public static final int AT=32;
    public static final int NAME=23;
    public static final int COMMA=29;
    public static final int PLUS=38;
    public static final int DIGIT=18;
    public static final int EQ=33;
    public static final int COMMENT=48;
    public static final int DOT=28;
    public static final int INTEGER=16;
    public static final int GE=35;
    public static final int ELSE=7;
    public static final int NUMBER=19;
    public static final int WHITESPACE=50;
    public static final int SEMICOLON=26;
    public static final int MINUS=39;
    public static final int TRUE=14;
    public static final int MUL=40;
    public static final int TRY=9;
    public static final int COLON=27;
    public static final int NEWLINE=47;
    public static final int NIL=13;
    public static final int OPEN_PARENT=30;
    public static final int OR=44;
    public static final int CLOSE_PARENT=31;
    public static final int ASSIGN=46;
    public static final int CONSTANT=25;
    public static final int GT=37;
    public static final int LOWER=21;
    public static final int DIV=41;
    public static final int END=11;
    public static final int CATCH=10;
    public static final int FALSE=15;
    public static final int SELF=12;
    public static final int LE=34;
    public static final int UPPER=24;
    public static final int STRING=20;

      boolean methodMode = false; // true if we're waiting for a method name

      public Token nextToken() {
        Token t = super.nextToken();
        // DEBUG Uncomment to output tokens
        // System.out.println("TOKEN> " + t);
        return t;
      }
      
      public boolean isNum(int c) {
        return c>='0' && c<='9';
      }
      
      @Override
      public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
      }


    // delegates
    // delegators

    public CameliaLexer() {;} 
    public CameliaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CameliaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CameliaLexer.g"; }

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:29:6: ({...}? => 'class' )
            // CameliaLexer.g:29:21: {...}? => 'class'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CLASS", "!methodMode");
            }
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:30:4: ({...}? => 'def' )
            // CameliaLexer.g:30:21: {...}? => 'def'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "DEF", "!methodMode");
            }
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:31:3: ({...}? => 'if' )
            // CameliaLexer.g:31:21: {...}? => 'if'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "IF", "!methodMode");
            }
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:32:5: ({...}? => 'else' )
            // CameliaLexer.g:32:21: {...}? => 'else'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ELSE", "!methodMode");
            }
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:33:6: ({...}? => 'while' )
            // CameliaLexer.g:33:21: {...}? => 'while'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "WHILE", "!methodMode");
            }
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:34:4: ({...}? => 'try' )
            // CameliaLexer.g:34:21: {...}? => 'try'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRY", "!methodMode");
            }
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:35:6: ({...}? => 'catch' )
            // CameliaLexer.g:35:21: {...}? => 'catch'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CATCH", "!methodMode");
            }
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:36:4: ({...}? => 'end' )
            // CameliaLexer.g:36:21: {...}? => 'end'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "END", "!methodMode");
            }
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:37:5: ({...}? => 'self' )
            // CameliaLexer.g:37:21: {...}? => 'self'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "SELF", "!methodMode");
            }
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:38:4: ({...}? => 'nil' )
            // CameliaLexer.g:38:21: {...}? => 'nil'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "NIL", "!methodMode");
            }
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:39:5: ({...}? => 'true' )
            // CameliaLexer.g:39:21: {...}? => 'true'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRUE", "!methodMode");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:40:6: ({...}? => 'false' )
            // CameliaLexer.g:40:21: {...}? => 'false'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "FALSE", "!methodMode");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // CameliaLexer.g:44:17: ()
            // CameliaLexer.g:44:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // CameliaLexer.g:45:15: ()
            // CameliaLexer.g:45:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:46:7: ( ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | ) )
            // CameliaLexer.g:46:21: ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | )
            {
            // CameliaLexer.g:46:21: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // CameliaLexer.g:46:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // CameliaLexer.g:46:26: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CameliaLexer.g:46:26: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // CameliaLexer.g:48:23: ({...}? => '.' ( DIGIT )+ | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') && ((isNum(input.LA(2))))) {
                alt4=1;
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // CameliaLexer.g:48:25: {...}? => '.' ( DIGIT )+
                    {
                    if ( !((isNum(input.LA(2)))) ) {
                        throw new FailedPredicateException(input, "NUMBER", "isNum(input.LA(2))");
                    }
                    match('.'); 
                    // CameliaLexer.g:48:53: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // CameliaLexer.g:48:53: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                     _type = FLOAT; 

                    }
                    break;
                case 2 :
                    // CameliaLexer.g:49:61: 
                    {
                     _type = INTEGER; 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:51:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // CameliaLexer.g:51:21: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // CameliaLexer.g:51:25: (~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // CameliaLexer.g:51:25: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:52:5: ( ( LOWER | '_' ) ( ID_CHAR )* ( '!' | '?' )? )
            // CameliaLexer.g:52:21: ( LOWER | '_' ) ( ID_CHAR )* ( '!' | '?' )?
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // CameliaLexer.g:52:35: ( ID_CHAR )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // CameliaLexer.g:52:35: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // CameliaLexer.g:52:44: ( '!' | '?' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='!'||LA7_0=='?') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // CameliaLexer.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

             methodMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:53:9: ( UPPER ( ID_CHAR )* )
            // CameliaLexer.g:53:21: UPPER ( ID_CHAR )*
            {
            mUPPER(); 
            // CameliaLexer.g:53:27: ( ID_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CameliaLexer.g:53:27: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:56:10: ( ';' )
            // CameliaLexer.g:56:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:57:6: ( ':' )
            // CameliaLexer.g:57:21: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:58:4: ( '.' )
            // CameliaLexer.g:58:21: '.'
            {
            match('.'); 
             methodMode = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:59:6: ( ',' )
            // CameliaLexer.g:59:21: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_PARENT"
    public final void mOPEN_PARENT() throws RecognitionException {
        try {
            int _type = OPEN_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:60:12: ( '(' )
            // CameliaLexer.g:60:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_PARENT"

    // $ANTLR start "CLOSE_PARENT"
    public final void mCLOSE_PARENT() throws RecognitionException {
        try {
            int _type = CLOSE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:61:13: ( ')' )
            // CameliaLexer.g:61:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_PARENT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:62:3: ( '@' )
            // CameliaLexer.g:62:21: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:63:3: ( '==' )
            // CameliaLexer.g:63:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:64:3: ( '<=' )
            // CameliaLexer.g:64:21: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:65:3: ( '>=' )
            // CameliaLexer.g:65:21: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:66:3: ( '<' )
            // CameliaLexer.g:66:21: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:67:3: ( '>' )
            // CameliaLexer.g:67:21: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:68:5: ( '+' )
            // CameliaLexer.g:68:21: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:69:6: ( '-' )
            // CameliaLexer.g:69:21: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:70:4: ( '*' )
            // CameliaLexer.g:70:21: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:71:4: ( '/' )
            // CameliaLexer.g:71:21: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:72:4: ( '%' )
            // CameliaLexer.g:72:21: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:73:4: ( '&&' )
            // CameliaLexer.g:73:21: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:74:3: ( '||' )
            // CameliaLexer.g:74:21: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:75:4: ( '!' )
            // CameliaLexer.g:75:21: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:76:7: ( '=' )
            // CameliaLexer.g:76:21: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:78:8: ( '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
            // CameliaLexer.g:78:21: '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
            {
            match('#'); 
            // CameliaLexer.g:78:25: (~ ( '\\r' | '\\n' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // CameliaLexer.g:78:25: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // CameliaLexer.g:78:41: ( NEWLINE | EOF )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            else {
                alt10=2;}
            switch (alt10) {
                case 1 :
                    // CameliaLexer.g:78:42: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;
                case 2 :
                    // CameliaLexer.g:78:52: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:80:8: ( ( '\\r' )? '\\n' )
            // CameliaLexer.g:80:21: ( '\\r' )? '\\n'
            {
            // CameliaLexer.g:80:21: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // CameliaLexer.g:80:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CameliaLexer.g:81:11: ( ( SPACE )+ )
            // CameliaLexer.g:81:21: ( SPACE )+
            {
            // CameliaLexer.g:81:21: ( SPACE )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // CameliaLexer.g:81:21: SPACE
            	    {
            	    mSPACE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // CameliaLexer.g:83:16: ( LOWER | UPPER )
            // CameliaLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID_CHAR"
    public final void mID_CHAR() throws RecognitionException {
        try {
            // CameliaLexer.g:84:17: ( LETTER | DIGIT | '_' )
            // CameliaLexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID_CHAR"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // CameliaLexer.g:85:15: ( 'a' .. 'z' )
            // CameliaLexer.g:85:21: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // CameliaLexer.g:86:15: ( 'A' .. 'Z' )
            // CameliaLexer.g:86:21: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // CameliaLexer.g:87:15: ( '0' .. '9' )
            // CameliaLexer.g:87:21: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // CameliaLexer.g:88:15: ( ' ' | '\\t' )
            // CameliaLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    public void mTokens() throws RecognitionException {
        // CameliaLexer.g:1:8: ( CLASS | DEF | IF | ELSE | WHILE | TRY | CATCH | END | SELF | NIL | TRUE | FALSE | NUMBER | STRING | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | AT | EQ | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // CameliaLexer.g:1:10: CLASS
                {
                mCLASS(); 

                }
                break;
            case 2 :
                // CameliaLexer.g:1:16: DEF
                {
                mDEF(); 

                }
                break;
            case 3 :
                // CameliaLexer.g:1:20: IF
                {
                mIF(); 

                }
                break;
            case 4 :
                // CameliaLexer.g:1:23: ELSE
                {
                mELSE(); 

                }
                break;
            case 5 :
                // CameliaLexer.g:1:28: WHILE
                {
                mWHILE(); 

                }
                break;
            case 6 :
                // CameliaLexer.g:1:34: TRY
                {
                mTRY(); 

                }
                break;
            case 7 :
                // CameliaLexer.g:1:38: CATCH
                {
                mCATCH(); 

                }
                break;
            case 8 :
                // CameliaLexer.g:1:44: END
                {
                mEND(); 

                }
                break;
            case 9 :
                // CameliaLexer.g:1:48: SELF
                {
                mSELF(); 

                }
                break;
            case 10 :
                // CameliaLexer.g:1:53: NIL
                {
                mNIL(); 

                }
                break;
            case 11 :
                // CameliaLexer.g:1:57: TRUE
                {
                mTRUE(); 

                }
                break;
            case 12 :
                // CameliaLexer.g:1:62: FALSE
                {
                mFALSE(); 

                }
                break;
            case 13 :
                // CameliaLexer.g:1:68: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 14 :
                // CameliaLexer.g:1:75: STRING
                {
                mSTRING(); 

                }
                break;
            case 15 :
                // CameliaLexer.g:1:82: NAME
                {
                mNAME(); 

                }
                break;
            case 16 :
                // CameliaLexer.g:1:87: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 17 :
                // CameliaLexer.g:1:96: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 18 :
                // CameliaLexer.g:1:106: COLON
                {
                mCOLON(); 

                }
                break;
            case 19 :
                // CameliaLexer.g:1:112: DOT
                {
                mDOT(); 

                }
                break;
            case 20 :
                // CameliaLexer.g:1:116: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 21 :
                // CameliaLexer.g:1:122: OPEN_PARENT
                {
                mOPEN_PARENT(); 

                }
                break;
            case 22 :
                // CameliaLexer.g:1:134: CLOSE_PARENT
                {
                mCLOSE_PARENT(); 

                }
                break;
            case 23 :
                // CameliaLexer.g:1:147: AT
                {
                mAT(); 

                }
                break;
            case 24 :
                // CameliaLexer.g:1:150: EQ
                {
                mEQ(); 

                }
                break;
            case 25 :
                // CameliaLexer.g:1:153: LE
                {
                mLE(); 

                }
                break;
            case 26 :
                // CameliaLexer.g:1:156: GE
                {
                mGE(); 

                }
                break;
            case 27 :
                // CameliaLexer.g:1:159: LT
                {
                mLT(); 

                }
                break;
            case 28 :
                // CameliaLexer.g:1:162: GT
                {
                mGT(); 

                }
                break;
            case 29 :
                // CameliaLexer.g:1:165: PLUS
                {
                mPLUS(); 

                }
                break;
            case 30 :
                // CameliaLexer.g:1:170: MINUS
                {
                mMINUS(); 

                }
                break;
            case 31 :
                // CameliaLexer.g:1:176: MUL
                {
                mMUL(); 

                }
                break;
            case 32 :
                // CameliaLexer.g:1:180: DIV
                {
                mDIV(); 

                }
                break;
            case 33 :
                // CameliaLexer.g:1:184: MOD
                {
                mMOD(); 

                }
                break;
            case 34 :
                // CameliaLexer.g:1:188: AND
                {
                mAND(); 

                }
                break;
            case 35 :
                // CameliaLexer.g:1:192: OR
                {
                mOR(); 

                }
                break;
            case 36 :
                // CameliaLexer.g:1:195: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // CameliaLexer.g:1:199: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 38 :
                // CameliaLexer.g:1:206: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 39 :
                // CameliaLexer.g:1:214: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 40 :
                // CameliaLexer.g:1:222: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\11\15\1\56\13\uffff\1\60\1\62\1\64\12\uffff\3\15\1\70\7"+
        "\15\7\uffff\2\15\1\103\1\uffff\1\15\1\106\1\15\1\110\2\15\1\113"+
        "\3\15\2\uffff\1\120\1\uffff\1\15\1\uffff\1\124\1\125\1\uffff\1\15"+
        "\1\130\1\131\3\uffff\1\133\4\uffff\1\136\13\uffff";
    static final String DFA13_eofS =
        "\143\uffff";
    static final String DFA13_minS =
        "\1\11\1\141\1\145\1\146\1\154\1\150\1\162\1\145\1\151\1\141\1\60"+
        "\13\uffff\3\75\12\uffff\1\141\1\164\1\146\1\41\1\163\1\144\1\151"+
        "\1\165\3\154\7\uffff\1\163\1\143\1\41\1\0\1\145\1\41\1\154\1\41"+
        "\1\145\1\146\1\41\2\163\1\150\1\0\1\uffff\1\41\1\0\1\145\1\0\2\41"+
        "\1\0\1\145\2\41\1\uffff\1\0\1\uffff\1\41\1\uffff\2\0\1\uffff\1\41"+
        "\2\0\1\uffff\1\0\2\uffff\1\0\4\uffff";
    static final String DFA13_maxS =
        "\1\174\1\154\1\145\1\146\1\156\1\150\1\162\1\145\1\151\1\141\1\71"+
        "\13\uffff\3\75\12\uffff\1\141\1\164\1\146\1\172\1\163\1\144\1\151"+
        "\1\171\3\154\7\uffff\1\163\1\143\1\172\1\0\1\145\1\172\1\154\1\172"+
        "\1\145\1\146\1\172\2\163\1\150\1\0\1\uffff\1\172\1\0\1\145\1\0\2"+
        "\172\1\0\1\145\2\172\1\uffff\1\0\1\uffff\1\172\1\uffff\2\0\1\uffff"+
        "\1\172\2\0\1\uffff\1\0\2\uffff\1\0\4\uffff";
    static final String DFA13_acceptS =
        "\13\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\3\uffff\1\35\1\37\1\40\1\41\1\42\1\43\1\44\1\46\1\47\1\50\13\uffff"+
        "\1\36\1\30\1\45\1\31\1\33\1\32\1\34\17\uffff\1\3\12\uffff\1\2\1"+
        "\uffff\1\10\1\uffff\1\6\2\uffff\1\12\3\uffff\1\4\1\uffff\1\13\1"+
        "\11\1\uffff\1\1\1\7\1\5\1\14";
    static final String DFA13_specialS =
        "\70\uffff\1\4\12\uffff\1\7\2\uffff\1\1\1\uffff\1\3\2\uffff\1\12"+
        "\4\uffff\1\5\3\uffff\1\11\1\13\2\uffff\1\6\1\0\1\uffff\1\2\2\uffff"+
        "\1\10\4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\42\1\41\2\uffff\1\41\22\uffff\1\42\1\37\1\14\1\40\1\uffff"+
            "\1\34\1\35\1\uffff\1\23\1\24\1\32\1\31\1\22\1\12\1\21\1\33\12"+
            "\13\1\20\1\17\1\27\1\26\1\30\1\uffff\1\25\32\16\4\uffff\1\15"+
            "\1\uffff\2\15\1\1\1\2\1\4\1\11\2\15\1\3\4\15\1\10\4\15\1\7\1"+
            "\6\2\15\1\5\3\15\1\uffff\1\36",
            "\1\44\12\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47\1\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\61",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\3\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\uffff",
            "\1\105",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\107",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\111",
            "\1\112",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\uffff",
            "",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\uffff",
            "\1\122",
            "\1\uffff",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\uffff",
            "\1\127",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "",
            "\1\uffff",
            "",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\15\16\uffff\12\15\5\uffff\1\15\1\uffff\32\15\4\uffff\1\15"+
            "\1\uffff\32\15",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CLASS | DEF | IF | ELSE | WHILE | TRY | CATCH | END | SELF | NIL | TRUE | FALSE | NUMBER | STRING | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | AT | EQ | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_89 = input.LA(1);

                         
                        int index13_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 96;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_89);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_70 = input.LA(1);

                         
                        int index13_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 81;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_70);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_91 = input.LA(1);

                         
                        int index13_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 97;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_91);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_72 = input.LA(1);

                         
                        int index13_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 83;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_72);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_56 = input.LA(1);

                         
                        int index13_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 68;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_56);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_80 = input.LA(1);

                         
                        int index13_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 90;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_80);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_88 = input.LA(1);

                         
                        int index13_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 95;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_88);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_67 = input.LA(1);

                         
                        int index13_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 79;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_67);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_94 = input.LA(1);

                         
                        int index13_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 98;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_94);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_84 = input.LA(1);

                         
                        int index13_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 92;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_84);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_75 = input.LA(1);

                         
                        int index13_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 86;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_75);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_85 = input.LA(1);

                         
                        int index13_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 93;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index13_85);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}