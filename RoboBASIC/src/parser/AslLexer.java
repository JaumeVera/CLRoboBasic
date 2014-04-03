// $ANTLR 3.4 /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g 2014-04-02 08:12:28

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int AVAN=7;
    public static final int BOOLEAN=8;
    public static final int COLOR=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int ELSE=13;
    public static final int ENDFUNC=14;
    public static final int ENDIF=15;
    public static final int ENDWHILE=16;
    public static final int EQUAL=17;
    public static final int ESC_SEQ=18;
    public static final int ESTADOPINTAR=19;
    public static final int FALSE=20;
    public static final int FUNC=21;
    public static final int FUNCALL=22;
    public static final int GE=23;
    public static final int GIRA=24;
    public static final int GT=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int INFRA=28;
    public static final int INIROBOT=29;
    public static final int INT=30;
    public static final int LBRACK=31;
    public static final int LE=32;
    public static final int LIST_FUNCTIONS=33;
    public static final int LIST_INSTR=34;
    public static final int LT=35;
    public static final int MINUS=36;
    public static final int MOD=37;
    public static final int MUL=38;
    public static final int NOBSTACLE=39;
    public static final int NOT=40;
    public static final int NOT_EQUAL=41;
    public static final int OBSTACLE=42;
    public static final int OR=43;
    public static final int PARAMS=44;
    public static final int PINTARCOLOR=45;
    public static final int PLUS=46;
    public static final int PREF=47;
    public static final int PVALUE=48;
    public static final int RBRACK=49;
    public static final int READ=50;
    public static final int RETRO=51;
    public static final int RETURN=52;
    public static final int SENTIR=53;
    public static final int STRING=54;
    public static final int THEN=55;
    public static final int TRUE=56;
    public static final int WHILE=57;
    public static final int WRITE=58;
    public static final int WS=59;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g"; }

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:6:7: ( '&' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:7:7: ( '(' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:8:7: ( ')' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:9:7: ( ',' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:10:7: ( ';' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:183:8: ( '[' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:183:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:184:8: ( ']' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:184:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:185:7: ( '=' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:185:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:186:10: ( '!=' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:186:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:187:8: ( '<' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:187:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:188:8: ( '<=' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:188:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:189:8: ( '>' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:189:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:190:8: ( '>=' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:190:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:191:6: ( '+' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:191:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:192:7: ( '-' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:192:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:193:9: ( '*' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:193:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:194:9: ( '/' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:194:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:195:9: ( '%' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:195:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:196:9: ( 'not' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:196:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:197:9: ( 'and' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:197:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:198:8: ( 'or' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:198:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:199:6: ( 'if' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:199:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:200:6: ( 'then' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:200:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:201:6: ( 'else' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:201:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:202:7: ( 'endif' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:202:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:203:7: ( 'while' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:203:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:204:8: ( 'do' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:204:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:205:9: ( 'endwhile' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:205:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:206:6: ( 'func' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:206:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:207:9: ( 'endfunc' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:207:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:208:8: ( 'return' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:208:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:209:6: ( 'read' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:209:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:210:7: ( 'write' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:210:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:211:9: ( 'true' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:211:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:212:9: ( 'false' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:212:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INIROBOT"
    public final void mINIROBOT() throws RecognitionException {
        try {
            int _type = INIROBOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:213:9: ( 'inirobot' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:213:11: 'inirobot'
            {
            match("inirobot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INIROBOT"

    // $ANTLR start "AVAN"
    public final void mAVAN() throws RecognitionException {
        try {
            int _type = AVAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:214:6: ( 'avanca' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:214:8: 'avanca'
            {
            match("avanca"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVAN"

    // $ANTLR start "RETRO"
    public final void mRETRO() throws RecognitionException {
        try {
            int _type = RETRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:215:7: ( 'retrocedeix' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:215:9: 'retrocedeix'
            {
            match("retrocedeix"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETRO"

    // $ANTLR start "NOBSTACLE"
    public final void mNOBSTACLE() throws RecognitionException {
        try {
            int _type = NOBSTACLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:216:11: ( 'noobstacle' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:216:13: 'noobstacle'
            {
            match("noobstacle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOBSTACLE"

    // $ANTLR start "PINTARCOLOR"
    public final void mPINTARCOLOR() throws RecognitionException {
        try {
            int _type = PINTARCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:217:13: ( 'pinta' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:217:15: 'pinta'
            {
            match("pinta"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PINTARCOLOR"

    // $ANTLR start "OBSTACLE"
    public final void mOBSTACLE() throws RecognitionException {
        try {
            int _type = OBSTACLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:218:10: ( 'obstacle' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:218:12: 'obstacle'
            {
            match("obstacle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBSTACLE"

    // $ANTLR start "SENTIR"
    public final void mSENTIR() throws RecognitionException {
        try {
            int _type = SENTIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:219:8: ( 'sentir' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:219:10: 'sentir'
            {
            match("sentir"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SENTIR"

    // $ANTLR start "INFRA"
    public final void mINFRA() throws RecognitionException {
        try {
            int _type = INFRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:220:7: ( 'infrared' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:220:9: 'infrared'
            {
            match("infrared"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INFRA"

    // $ANTLR start "GIRA"
    public final void mGIRA() throws RecognitionException {
        try {
            int _type = GIRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:221:6: ( 'gira' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:221:8: 'gira'
            {
            match("gira"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GIRA"

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:7: ( ( 'red' | 'green' | 'yellow' | 'blue' | 'black' | 'white' ) )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:9: ( 'red' | 'green' | 'yellow' | 'blue' | 'black' | 'white' )
            {
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:9: ( 'red' | 'green' | 'yellow' | 'blue' | 'black' | 'white' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt1=1;
                }
                break;
            case 'g':
                {
                alt1=2;
                }
                break;
            case 'y':
                {
                alt1=3;
                }
                break;
            case 'b':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='l') ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6=='u') ) {
                        alt1=4;
                    }
                    else if ( (LA1_6=='a') ) {
                        alt1=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'w':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:10: 'red'
                    {
                    match("red"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:18: 'green'
                    {
                    match("green"); 



                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:28: 'yellow'
                    {
                    match("yellow"); 



                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:39: 'blue'
                    {
                    match("blue"); 



                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:48: 'black'
                    {
                    match("black"); 



                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:222:58: 'white'
                    {
                    match("white"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLOR"

    // $ANTLR start "ESTADOPINTAR"
    public final void mESTADOPINTAR() throws RecognitionException {
        try {
            int _type = ESTADOPINTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:223:14: ( ( 'up' | 'down' ) )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:223:16: ( 'up' | 'down' )
            {
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:223:16: ( 'up' | 'down' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='u') ) {
                alt2=1;
            }
            else if ( (LA2_0=='d') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:223:17: 'up'
                    {
                    match("up"); 



                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:223:24: 'down'
                    {
                    match("down"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESTADOPINTAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:224:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:224:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:224:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:225:6: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:225:8: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:225:8: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:228:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:228:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:228:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:228:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:228:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:229:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:229:13: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:229:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:233:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:233:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:233:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:233:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:233:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:239:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:239:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:242:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:242:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:8: ( T__60 | T__61 | T__62 | T__63 | T__64 | LBRACK | RBRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | INIROBOT | AVAN | RETRO | NOBSTACLE | PINTARCOLOR | OBSTACLE | SENTIR | INFRA | GIRA | COLOR | ESTADOPINTAR | ID | INT | COMMENT | STRING | WS )
        int alt10=51;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:10: T__60
                {
                mT__60(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:16: T__61
                {
                mT__61(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:22: T__62
                {
                mT__62(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:28: T__63
                {
                mT__63(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:34: T__64
                {
                mT__64(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:40: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:47: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:54: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:60: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:70: LT
                {
                mLT(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:73: LE
                {
                mLE(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:76: GT
                {
                mGT(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:79: GE
                {
                mGE(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:82: PLUS
                {
                mPLUS(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:87: MINUS
                {
                mMINUS(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:93: MUL
                {
                mMUL(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:97: DIV
                {
                mDIV(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:101: MOD
                {
                mMOD(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:105: NOT
                {
                mNOT(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:109: AND
                {
                mAND(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:113: OR
                {
                mOR(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:116: IF
                {
                mIF(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:119: THEN
                {
                mTHEN(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:124: ELSE
                {
                mELSE(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:129: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:135: WHILE
                {
                mWHILE(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:141: DO
                {
                mDO(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:144: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:153: FUNC
                {
                mFUNC(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:158: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:166: RETURN
                {
                mRETURN(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:173: READ
                {
                mREAD(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:178: WRITE
                {
                mWRITE(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:184: TRUE
                {
                mTRUE(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:189: FALSE
                {
                mFALSE(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:195: INIROBOT
                {
                mINIROBOT(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:204: AVAN
                {
                mAVAN(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:209: RETRO
                {
                mRETRO(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:215: NOBSTACLE
                {
                mNOBSTACLE(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:225: PINTARCOLOR
                {
                mPINTARCOLOR(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:237: OBSTACLE
                {
                mOBSTACLE(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:246: SENTIR
                {
                mSENTIR(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:253: INFRA
                {
                mINFRA(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:259: GIRA
                {
                mGIRA(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:264: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:270: ESTADOPINTAR
                {
                mESTADOPINTAR(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:283: ID
                {
                mID(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:286: INT
                {
                mINT(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:290: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:298: STRING
                {
                mSTRING(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1136162/dades/linux/Q10/CL/RoboBASIC/src/parser/Asl.g:1:305: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff\1\46\1\50\3\uffff\1\52\1\uffff\20\41\12\uffff\3\41\1\107"+
        "\1\41\1\111\7\41\1\123\11\41\1\140\1\141\1\41\1\143\1\41\1\uffff"+
        "\1\41\1\uffff\11\41\1\uffff\4\41\1\167\7\41\2\uffff\1\41\1\uffff"+
        "\4\41\1\u0084\1\u0085\1\u0086\6\41\1\140\1\u008d\3\41\1\u0091\1"+
        "\uffff\2\41\1\u0094\2\41\1\167\6\41\3\uffff\1\u009d\2\41\1\u00a0"+
        "\1\167\1\u00a1\1\uffff\1\u00a2\2\41\1\uffff\1\u00a5\1\41\1\uffff"+
        "\1\167\1\41\1\167\1\41\1\u00a9\3\41\1\uffff\2\41\3\uffff\1\u00af"+
        "\1\41\1\uffff\1\u00b1\1\167\1\41\1\uffff\4\41\1\u00b7\1\uffff\1"+
        "\41\1\uffff\1\41\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\uffff\2\41\4"+
        "\uffff\1\41\1\u00c1\1\41\1\uffff\1\u00c3\1\uffff";
    static final String DFA10_eofS =
        "\u00c4\uffff";
    static final String DFA10_minS =
        "\1\11\11\uffff\2\75\3\uffff\1\52\1\uffff\1\157\1\156\1\142\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\1\145\1\151\1\145\1\151\1\145\1\154"+
        "\1\160\12\uffff\1\157\1\144\1\141\1\60\1\163\1\60\1\146\1\145\1"+
        "\165\1\163\1\144\2\151\1\60\1\156\1\154\1\141\2\156\1\162\1\145"+
        "\1\154\1\141\2\60\1\142\1\60\1\156\1\uffff\1\164\1\uffff\2\162\1"+
        "\156\2\145\1\146\1\154\1\164\1\156\1\uffff\1\143\1\163\1\162\1\144"+
        "\1\60\2\164\1\141\1\145\1\154\1\145\1\143\2\uffff\1\163\1\uffff"+
        "\1\143\1\141\1\157\1\141\3\60\1\146\1\150\1\165\3\145\2\60\1\145"+
        "\1\162\1\157\1\60\1\uffff\1\141\1\151\1\60\1\156\1\157\1\60\1\153"+
        "\1\164\1\141\1\143\1\142\1\162\3\uffff\1\60\1\151\1\156\3\60\1\uffff"+
        "\1\60\1\156\1\143\1\uffff\1\60\1\162\1\uffff\1\60\1\167\1\60\1\141"+
        "\1\60\1\154\1\157\1\145\1\uffff\1\154\1\143\3\uffff\1\60\1\145\1"+
        "\uffff\2\60\1\143\1\uffff\1\145\1\164\1\144\1\145\1\60\1\uffff\1"+
        "\144\1\uffff\1\154\4\60\1\uffff\2\145\4\uffff\1\151\1\60\1\170\1"+
        "\uffff\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\172\11\uffff\2\75\3\uffff\1\57\1\uffff\1\157\1\166\1\162\1\156"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\1\151\1\145\1\162\1\145\1\154"+
        "\1\160\12\uffff\1\164\1\144\1\141\1\172\1\163\1\172\1\151\1\145"+
        "\1\165\1\163\1\144\2\151\1\172\1\156\1\154\1\164\2\156\1\162\1\145"+
        "\1\154\1\165\2\172\1\142\1\172\1\156\1\uffff\1\164\1\uffff\2\162"+
        "\1\156\2\145\1\167\2\164\1\156\1\uffff\1\143\1\163\1\165\1\144\1"+
        "\172\2\164\1\141\1\145\1\154\1\145\1\143\2\uffff\1\163\1\uffff\1"+
        "\143\1\141\1\157\1\141\3\172\1\146\1\150\1\165\3\145\2\172\1\145"+
        "\1\162\1\157\1\172\1\uffff\1\141\1\151\1\172\1\156\1\157\1\172\1"+
        "\153\1\164\1\141\1\143\1\142\1\162\3\uffff\1\172\1\151\1\156\3\172"+
        "\1\uffff\1\172\1\156\1\143\1\uffff\1\172\1\162\1\uffff\1\172\1\167"+
        "\1\172\1\141\1\172\1\154\1\157\1\145\1\uffff\1\154\1\143\3\uffff"+
        "\1\172\1\145\1\uffff\2\172\1\143\1\uffff\1\145\1\164\1\144\1\145"+
        "\1\172\1\uffff\1\144\1\uffff\1\154\4\172\1\uffff\2\145\4\uffff\1"+
        "\151\1\172\1\170\1\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\16\1\17"+
        "\1\20\1\uffff\1\22\20\uffff\1\57\1\60\1\62\1\63\1\13\1\12\1\15\1"+
        "\14\1\61\1\21\34\uffff\1\25\1\uffff\1\26\11\uffff\1\33\14\uffff"+
        "\1\56\1\23\1\uffff\1\24\23\uffff\1\55\14\uffff\1\27\1\42\1\30\6"+
        "\uffff\1\35\3\uffff\1\40\2\uffff\1\54\10\uffff\1\31\2\uffff\1\32"+
        "\1\41\1\43\2\uffff\1\50\3\uffff\1\45\5\uffff\1\37\1\uffff\1\52\5"+
        "\uffff\1\36\2\uffff\1\51\1\44\1\53\1\34\3\uffff\1\47\1\uffff\1\46";
    static final String DFA10_specialS =
        "\u00c4\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\11\1\43\2\uffff\1\20\1\1"+
            "\1\uffff\1\2\1\3\1\16\1\14\1\4\1\15\1\uffff\1\17\12\42\1\uffff"+
            "\1\5\1\12\1\10\1\13\2\uffff\32\41\1\6\1\uffff\1\7\1\uffff\1"+
            "\41\1\uffff\1\22\1\37\1\41\1\30\1\26\1\31\1\35\1\41\1\24\4\41"+
            "\1\21\1\23\1\33\1\41\1\32\1\34\1\25\1\40\1\41\1\27\1\41\1\36"+
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\47",
            "",
            "",
            "",
            "\1\51\4\uffff\1\51",
            "",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\57\17\uffff\1\56",
            "\1\60\7\uffff\1\61",
            "\1\62\11\uffff\1\63",
            "\1\64\1\uffff\1\65",
            "\1\66\11\uffff\1\67",
            "\1\70",
            "\1\72\23\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\10\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
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
            "\1\104\4\uffff\1\103",
            "\1\105",
            "\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\110",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\113\2\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\26\41\1\122\3\41",
            "\1\124",
            "\1\125",
            "\1\127\2\uffff\1\130\17\uffff\1\126",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\23\uffff\1\136",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\142",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\155\2\uffff\1\153\15\uffff\1\154",
            "\1\156\7\uffff\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\165\2\uffff\1\164",
            "\1\166",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0092",
            "\1\u0093",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0095",
            "\1\u0096",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009e",
            "\1\u009f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a6",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b0",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "\1\u00c0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c2",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__60 | T__61 | T__62 | T__63 | T__64 | LBRACK | RBRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | INIROBOT | AVAN | RETRO | NOBSTACLE | PINTARCOLOR | OBSTACLE | SENTIR | INFRA | GIRA | COLOR | ESTADOPINTAR | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}