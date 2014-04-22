// $ANTLR 3.4 /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g 2014-04-21 20:18:01

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVAN", "BOOLEAN", "COLOR", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "ESTADOPINTAR", "FALSE", "FUNC", "FUNCALL", "GE", "GIRA", "GT", "ID", "IF", "INFRA", "INIROBOT", "INT", "LBRACK", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NOBSTACLE", "NOT", "NOT_EQUAL", "OBSTACLE", "OR", "PARAMS", "PINTARCOLOR", "PLUS", "PREF", "PVALUE", "RBRACK", "READ", "RETRO", "RETURN", "SENTIR", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "')'", "','", "';'"
    };

    public static final int EOF=-1;
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
    public static final int LPAREN=35;
    public static final int LT=36;
    public static final int MINUS=37;
    public static final int MOD=38;
    public static final int MUL=39;
    public static final int NOBSTACLE=40;
    public static final int NOT=41;
    public static final int NOT_EQUAL=42;
    public static final int OBSTACLE=43;
    public static final int OR=44;
    public static final int PARAMS=45;
    public static final int PINTARCOLOR=46;
    public static final int PLUS=47;
    public static final int PREF=48;
    public static final int PVALUE=49;
    public static final int RBRACK=50;
    public static final int READ=51;
    public static final int RETRO=52;
    public static final int RETURN=53;
    public static final int SENTIR=54;
    public static final int STRING=55;
    public static final int THEN=56;
    public static final int TRUE=57;
    public static final int WHILE=58;
    public static final int WRITE=59;
    public static final int WS=60;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog163);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog166);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:64:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:64:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func205); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func208); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func210);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func212);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func214); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_params233);  
            stream_LPAREN.add(char_literal8);


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==61) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params235);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,62,FOLLOW_62_in_params238);  
            stream_62.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 68:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:68:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:72:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist264);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==63) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,63,FOLLOW_63_in_paramlist267); 

            	    pushFollow(FOLLOW_param_in_paramlist270);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:77:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:77:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==61) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:77:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,61,FOLLOW_61_in_param295);  
                    stream_61.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param299);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 77:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:77:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:78:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param322);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:78:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:82:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:83:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:83:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions356);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:83:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==64) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:83:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,64,FOLLOW_64_in_block_instructions359);  
            	    stream_64.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions361);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 84:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:84:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:88:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;

        AslParser.special_instruction_return special_instruction25 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:89:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |)
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==LPAREN) ) {
                    alt6=4;
                }
                else if ( (LA6_1==EQUAL||LA6_1==LBRACK) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case AVAN:
            case GIRA:
            case INFRA:
            case INIROBOT:
            case NOBSTACLE:
            case OBSTACLE:
            case PINTARCOLOR:
            case RETRO:
            case SENTIR:
                {
                alt6=8;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 64:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:89:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction410);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:90:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction432);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:91:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction452);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:92:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction472);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:93:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction493);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:94:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction510);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:95:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction535);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:96:11: special_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_special_instruction_in_instruction558);
                    special_instruction25=special_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, special_instruction25.getTree());

                    }
                    break;
                case 9 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:98:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class special_instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "special_instruction"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:100:1: special_instruction : ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors );
    public final AslParser.special_instruction_return special_instruction() throws RecognitionException {
        AslParser.special_instruction_return retval = new AslParser.special_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INIROBOT26=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token AVAN32=null;
        Token RETRO34=null;
        Token NOBSTACLE36=null;
        Token COLOR37=null;
        Token char_literal38=null;
        Token COLOR39=null;
        Token GIRA40=null;
        Token PINTARCOLOR42=null;
        Token ESTADOPINTAR43=null;
        Token OBSTACLE44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token COLOR53=null;
        Token char_literal54=null;
        Token COLOR55=null;
        AslParser.expr_return expr27 =null;

        AslParser.expr_return expr29 =null;

        AslParser.expr_return expr31 =null;

        AslParser.expr_return expr33 =null;

        AslParser.expr_return expr35 =null;

        AslParser.expr_return expr41 =null;

        AslParser.expr_return expr45 =null;

        AslParser.expr_return expr47 =null;

        AslParser.expr_return expr49 =null;

        AslParser.expr_return expr51 =null;

        AslParser.sensors_return sensors56 =null;


        AslTree INIROBOT26_tree=null;
        AslTree char_literal28_tree=null;
        AslTree char_literal30_tree=null;
        AslTree AVAN32_tree=null;
        AslTree RETRO34_tree=null;
        AslTree NOBSTACLE36_tree=null;
        AslTree COLOR37_tree=null;
        AslTree char_literal38_tree=null;
        AslTree COLOR39_tree=null;
        AslTree GIRA40_tree=null;
        AslTree PINTARCOLOR42_tree=null;
        AslTree ESTADOPINTAR43_tree=null;
        AslTree OBSTACLE44_tree=null;
        AslTree char_literal46_tree=null;
        AslTree char_literal48_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal52_tree=null;
        AslTree COLOR53_tree=null;
        AslTree char_literal54_tree=null;
        AslTree COLOR55_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:101:2: ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors )
            int alt8=8;
            switch ( input.LA(1) ) {
            case INIROBOT:
                {
                alt8=1;
                }
                break;
            case AVAN:
                {
                alt8=2;
                }
                break;
            case RETRO:
                {
                alt8=3;
                }
                break;
            case NOBSTACLE:
                {
                alt8=4;
                }
                break;
            case GIRA:
                {
                alt8=5;
                }
                break;
            case PINTARCOLOR:
                {
                alt8=6;
                }
                break;
            case OBSTACLE:
                {
                alt8=7;
                }
                break;
            case INFRA:
            case SENTIR:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:101:4: INIROBOT ^ expr ',' ! expr ',' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INIROBOT26=(Token)match(input,INIROBOT,FOLLOW_INIROBOT_in_special_instruction606); 
                    INIROBOT26_tree = 
                    (AslTree)adaptor.create(INIROBOT26)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INIROBOT26_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction609);
                    expr27=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr27.getTree());

                    char_literal28=(Token)match(input,63,FOLLOW_63_in_special_instruction611); 

                    pushFollow(FOLLOW_expr_in_special_instruction614);
                    expr29=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr29.getTree());

                    char_literal30=(Token)match(input,63,FOLLOW_63_in_special_instruction616); 

                    pushFollow(FOLLOW_expr_in_special_instruction619);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr31.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:102:4: AVAN ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    AVAN32=(Token)match(input,AVAN,FOLLOW_AVAN_in_special_instruction624); 
                    AVAN32_tree = 
                    (AslTree)adaptor.create(AVAN32)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(AVAN32_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction627);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr33.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:103:4: RETRO ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RETRO34=(Token)match(input,RETRO,FOLLOW_RETRO_in_special_instruction632); 
                    RETRO34_tree = 
                    (AslTree)adaptor.create(RETRO34)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RETRO34_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction635);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr35.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:104:4: NOBSTACLE ^ COLOR ( ',' ! COLOR )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    NOBSTACLE36=(Token)match(input,NOBSTACLE,FOLLOW_NOBSTACLE_in_special_instruction640); 
                    NOBSTACLE36_tree = 
                    (AslTree)adaptor.create(NOBSTACLE36)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOBSTACLE36_tree, root_0);


                    COLOR37=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction643); 
                    COLOR37_tree = 
                    (AslTree)adaptor.create(COLOR37)
                    ;
                    adaptor.addChild(root_0, COLOR37_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:104:21: ( ',' ! COLOR )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==63) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:104:22: ',' ! COLOR
                            {
                            char_literal38=(Token)match(input,63,FOLLOW_63_in_special_instruction646); 

                            COLOR39=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction649); 
                            COLOR39_tree = 
                            (AslTree)adaptor.create(COLOR39)
                            ;
                            adaptor.addChild(root_0, COLOR39_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:105:4: GIRA ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    GIRA40=(Token)match(input,GIRA,FOLLOW_GIRA_in_special_instruction656); 
                    GIRA40_tree = 
                    (AslTree)adaptor.create(GIRA40)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(GIRA40_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction659);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:106:4: PINTARCOLOR ^ ESTADOPINTAR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PINTARCOLOR42=(Token)match(input,PINTARCOLOR,FOLLOW_PINTARCOLOR_in_special_instruction664); 
                    PINTARCOLOR42_tree = 
                    (AslTree)adaptor.create(PINTARCOLOR42)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PINTARCOLOR42_tree, root_0);


                    ESTADOPINTAR43=(Token)match(input,ESTADOPINTAR,FOLLOW_ESTADOPINTAR_in_special_instruction667); 
                    ESTADOPINTAR43_tree = 
                    (AslTree)adaptor.create(ESTADOPINTAR43)
                    ;
                    adaptor.addChild(root_0, ESTADOPINTAR43_tree);


                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:107:4: OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    OBSTACLE44=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_special_instruction672); 
                    OBSTACLE44_tree = 
                    (AslTree)adaptor.create(OBSTACLE44)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(OBSTACLE44_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction675);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

                    char_literal46=(Token)match(input,63,FOLLOW_63_in_special_instruction677); 

                    pushFollow(FOLLOW_expr_in_special_instruction680);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    char_literal48=(Token)match(input,63,FOLLOW_63_in_special_instruction682); 

                    pushFollow(FOLLOW_expr_in_special_instruction685);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                    char_literal50=(Token)match(input,63,FOLLOW_63_in_special_instruction687); 

                    pushFollow(FOLLOW_expr_in_special_instruction690);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

                    char_literal52=(Token)match(input,63,FOLLOW_63_in_special_instruction692); 

                    COLOR53=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction695); 
                    COLOR53_tree = 
                    (AslTree)adaptor.create(COLOR53)
                    ;
                    adaptor.addChild(root_0, COLOR53_tree);


                    char_literal54=(Token)match(input,63,FOLLOW_63_in_special_instruction697); 

                    COLOR55=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction700); 
                    COLOR55_tree = 
                    (AslTree)adaptor.create(COLOR55)
                    ;
                    adaptor.addChild(root_0, COLOR55_tree);


                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:108:4: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_special_instruction705);
                    sensors56=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "special_instruction"


    public static class sensors_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sensors"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:111:1: sensors : ( SENTIR ^| INFRA ^);
    public final AslParser.sensors_return sensors() throws RecognitionException {
        AslParser.sensors_return retval = new AslParser.sensors_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SENTIR57=null;
        Token INFRA58=null;

        AslTree SENTIR57_tree=null;
        AslTree INFRA58_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:112:2: ( SENTIR ^| INFRA ^)
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SENTIR) ) {
                alt9=1;
            }
            else if ( (LA9_0==INFRA) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:112:4: SENTIR ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SENTIR57=(Token)match(input,SENTIR,FOLLOW_SENTIR_in_sensors716); 
                    SENTIR57_tree = 
                    (AslTree)adaptor.create(SENTIR57)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SENTIR57_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:113:4: INFRA ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INFRA58=(Token)match(input,INFRA,FOLLOW_INFRA_in_sensors722); 
                    INFRA58_tree = 
                    (AslTree)adaptor.create(INFRA58)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INFRA58_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sensors"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:117:1: assign : idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.idtypes_return idtypes59 =null;

        AslParser.expr_return expr60 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_idtypes=new RewriteRuleSubtreeStream(adaptor,"rule idtypes");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:117:8: ( idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:117:10: idtypes eq= EQUAL expr
            {
            pushFollow(FOLLOW_idtypes_in_assign736);
            idtypes59=idtypes();

            state._fsp--;

            stream_idtypes.add(idtypes59.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign740);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign742);
            expr60=expr();

            state._fsp--;

            stream_expr.add(expr60.getTree());

            // AST REWRITE
            // elements: expr, idtypes, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 117:32: -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:117:35: ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_idtypes.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:117:67: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class idtypes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "idtypes"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:121:1: idtypes : ID ( LBRACK ^ expr RBRACK !)? ;
    public final AslParser.idtypes_return idtypes() throws RecognitionException {
        AslParser.idtypes_return retval = new AslParser.idtypes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID61=null;
        Token LBRACK62=null;
        Token RBRACK64=null;
        AslParser.expr_return expr63 =null;


        AslTree ID61_tree=null;
        AslTree LBRACK62_tree=null;
        AslTree RBRACK64_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:121:9: ( ID ( LBRACK ^ expr RBRACK !)? )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:121:11: ID ( LBRACK ^ expr RBRACK !)?
            {
            root_0 = (AslTree)adaptor.nil();


            ID61=(Token)match(input,ID,FOLLOW_ID_in_idtypes774); 
            ID61_tree = 
            (AslTree)adaptor.create(ID61)
            ;
            adaptor.addChild(root_0, ID61_tree);


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:121:14: ( LBRACK ^ expr RBRACK !)?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LBRACK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:121:15: LBRACK ^ expr RBRACK !
                    {
                    LBRACK62=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_idtypes777); 
                    LBRACK62_tree = 
                    (AslTree)adaptor.create(LBRACK62)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LBRACK62_tree, root_0);


                    pushFollow(FOLLOW_expr_in_idtypes780);
                    expr63=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr63.getTree());

                    RBRACK64=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_idtypes782); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idtypes"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:125:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF65=null;
        Token THEN67=null;
        Token ELSE69=null;
        Token ENDIF71=null;
        AslParser.expr_return expr66 =null;

        AslParser.block_instructions_return block_instructions68 =null;

        AslParser.block_instructions_return block_instructions70 =null;


        AslTree IF65_tree=null;
        AslTree THEN67_tree=null;
        AslTree ELSE69_tree=null;
        AslTree ENDIF71_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:125:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:125:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF65=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt804); 
            IF65_tree = 
            (AslTree)adaptor.create(IF65)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF65_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt807);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());

            THEN67=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt809); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt812);
            block_instructions68=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions68.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:125:46: ( ELSE ! block_instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:125:47: ELSE ! block_instructions
                    {
                    ELSE69=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt815); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt818);
                    block_instructions70=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions70.getTree());

                    }
                    break;

            }


            ENDIF71=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt822); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:129:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE72=null;
        Token DO74=null;
        Token ENDWHILE76=null;
        AslParser.expr_return expr73 =null;

        AslParser.block_instructions_return block_instructions75 =null;


        AslTree WHILE72_tree=null;
        AslTree DO74_tree=null;
        AslTree ENDWHILE76_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:129:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:129:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE72=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt845); 
            WHILE72_tree = 
            (AslTree)adaptor.create(WHILE72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE72_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt848);
            expr73=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr73.getTree());

            DO74=(Token)match(input,DO,FOLLOW_DO_in_while_stmt850); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt853);
            block_instructions75=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions75.getTree());

            ENDWHILE76=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt855); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:133:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN77=null;
        AslParser.expr_return expr78 =null;


        AslTree RETURN77_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:133:13: ( RETURN ^ ( expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:133:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN77=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt878); 
            RETURN77_tree = 
            (AslTree)adaptor.create(RETURN77)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN77_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:133:23: ( expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INFRA||LA12_0==INT||LA12_0==LPAREN||LA12_0==MINUS||LA12_0==NOT||LA12_0==PLUS||LA12_0==SENTIR||LA12_0==TRUE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:133:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt881);
                    expr78=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr78.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:137:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ79=null;
        Token ID80=null;

        AslTree READ79_tree=null;
        AslTree ID80_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:137:6: ( READ ^ ID )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:137:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ79=(Token)match(input,READ,FOLLOW_READ_in_read900); 
            READ79_tree = 
            (AslTree)adaptor.create(READ79)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ79_tree, root_0);


            ID80=(Token)match(input,ID,FOLLOW_ID_in_read903); 
            ID80_tree = 
            (AslTree)adaptor.create(ID80)
            ;
            adaptor.addChild(root_0, ID80_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE81=null;
        Token STRING83=null;
        AslParser.expr_return expr82 =null;


        AslTree WRITE81_tree=null;
        AslTree STRING83_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:7: ( WRITE ^ ( expr | STRING ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE81=(Token)match(input,WRITE,FOLLOW_WRITE_in_write923); 
            WRITE81_tree = 
            (AslTree)adaptor.create(WRITE81)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE81_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:18: ( expr | STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INFRA||LA13_0==INT||LA13_0==LPAREN||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==SENTIR||LA13_0==TRUE) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write927);
                    expr82=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr82.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:141:26: STRING
                    {
                    STRING83=(Token)match(input,STRING,FOLLOW_STRING_in_write931); 
                    STRING83_tree = 
                    (AslTree)adaptor.create(STRING83)
                    ;
                    adaptor.addChild(root_0, STRING83_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:145:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR85=null;
        AslParser.boolterm_return boolterm84 =null;

        AslParser.boolterm_return boolterm86 =null;


        AslTree OR85_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:145:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:145:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr956);
            boolterm84=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm84.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:145:22: ( OR ^ boolterm )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:145:23: OR ^ boolterm
            	    {
            	    OR85=(Token)match(input,OR,FOLLOW_OR_in_expr959); 
            	    OR85_tree = 
            	    (AslTree)adaptor.create(OR85)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR85_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr962);
            	    boolterm86=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm86.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:148:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND88=null;
        AslParser.boolfact_return boolfact87 =null;

        AslParser.boolfact_return boolfact89 =null;


        AslTree AND88_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:148:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:148:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm982);
            boolfact87=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact87.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:148:22: ( AND ^ boolfact )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:148:23: AND ^ boolfact
            	    {
            	    AND88=(Token)match(input,AND,FOLLOW_AND_in_boolterm985); 
            	    AND88_tree = 
            	    (AslTree)adaptor.create(AND88)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND88_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm988);
            	    boolfact89=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact89.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL91=null;
        Token NOT_EQUAL92=null;
        Token LT93=null;
        Token LE94=null;
        Token GT95=null;
        Token GE96=null;
        AslParser.num_expr_return num_expr90 =null;

        AslParser.num_expr_return num_expr97 =null;


        AslTree EQUAL91_tree=null;
        AslTree NOT_EQUAL92_tree=null;
        AslTree LT93_tree=null;
        AslTree LE94_tree=null;
        AslTree GT95_tree=null;
        AslTree GE96_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1008);
            num_expr90=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr90.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EQUAL||LA17_0==GE||LA17_0==GT||LA17_0==LE||LA17_0==LT||LA17_0==NOT_EQUAL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt16=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt16=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt16=2;
                        }
                        break;
                    case LT:
                        {
                        alt16=3;
                        }
                        break;
                    case LE:
                        {
                        alt16=4;
                        }
                        break;
                    case GT:
                        {
                        alt16=5;
                        }
                        break;
                    case GE:
                        {
                        alt16=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }

                    switch (alt16) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:24: EQUAL ^
                            {
                            EQUAL91=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1012); 
                            EQUAL91_tree = 
                            (AslTree)adaptor.create(EQUAL91)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL91_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL92=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1017); 
                            NOT_EQUAL92_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL92)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL92_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:46: LT ^
                            {
                            LT93=(Token)match(input,LT,FOLLOW_LT_in_boolfact1022); 
                            LT93_tree = 
                            (AslTree)adaptor.create(LT93)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT93_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:52: LE ^
                            {
                            LE94=(Token)match(input,LE,FOLLOW_LE_in_boolfact1027); 
                            LE94_tree = 
                            (AslTree)adaptor.create(LE94)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE94_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:58: GT ^
                            {
                            GT95=(Token)match(input,GT,FOLLOW_GT_in_boolfact1032); 
                            GT95_tree = 
                            (AslTree)adaptor.create(GT95)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT95_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:151:64: GE ^
                            {
                            GE96=(Token)match(input,GE,FOLLOW_GE_in_boolfact1037); 
                            GE96_tree = 
                            (AslTree)adaptor.create(GE96)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE96_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1041);
                    num_expr97=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr97.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS99=null;
        Token MINUS100=null;
        AslParser.term_return term98 =null;

        AslParser.term_return term101 =null;


        AslTree PLUS99_tree=null;
        AslTree MINUS100_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1061);
            term98=term();

            state._fsp--;

            adaptor.addChild(root_0, term98.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:18: ( ( PLUS ^| MINUS ^) term )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==MINUS||LA19_0==PLUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:20: ( PLUS ^| MINUS ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==PLUS) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==MINUS) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:21: PLUS ^
            	            {
            	            PLUS99=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1066); 
            	            PLUS99_tree = 
            	            (AslTree)adaptor.create(PLUS99)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS99_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:154:29: MINUS ^
            	            {
            	            MINUS100=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1071); 
            	            MINUS100_tree = 
            	            (AslTree)adaptor.create(MINUS100)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS100_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1075);
            	    term101=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term101.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL103=null;
        Token DIV104=null;
        Token MOD105=null;
        AslParser.factor_return factor102 =null;

        AslParser.factor_return factor106 =null;


        AslTree MUL103_tree=null;
        AslTree DIV104_tree=null;
        AslTree MOD105_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1099);
            factor102=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor102.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DIV||(LA21_0 >= MOD && LA21_0 <= MUL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:23: MUL ^
            	            {
            	            MUL103=(Token)match(input,MUL,FOLLOW_MUL_in_term1104); 
            	            MUL103_tree = 
            	            (AslTree)adaptor.create(MUL103)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL103_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:30: DIV ^
            	            {
            	            DIV104=(Token)match(input,DIV,FOLLOW_DIV_in_term1109); 
            	            DIV104_tree = 
            	            (AslTree)adaptor.create(DIV104)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV104_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:157:37: MOD ^
            	            {
            	            MOD105=(Token)match(input,MOD,FOLLOW_MOD_in_term1114); 
            	            MOD105_tree = 
            	            (AslTree)adaptor.create(MOD105)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD105_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1118);
            	    factor106=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor106.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT107=null;
        Token PLUS108=null;
        Token MINUS109=null;
        AslParser.atom_return atom110 =null;


        AslTree NOT107_tree=null;
        AslTree PLUS108_tree=null;
        AslTree MINUS109_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt22=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt22=1;
                    }
                    break;
                case PLUS:
                    {
                    alt22=2;
                    }
                    break;
                case MINUS:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:14: NOT ^
                    {
                    NOT107=(Token)match(input,NOT,FOLLOW_NOT_in_factor1141); 
                    NOT107_tree = 
                    (AslTree)adaptor.create(NOT107)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT107_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:21: PLUS ^
                    {
                    PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1146); 
                    PLUS108_tree = 
                    (AslTree)adaptor.create(PLUS108)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS108_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:160:29: MINUS ^
                    {
                    MINUS109=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1151); 
                    MINUS109_tree = 
                    (AslTree)adaptor.create(MINUS109)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS109_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1156);
            atom110=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom110.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:166:1: atom : ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID111=null;
        Token LBRACK112=null;
        Token RBRACK114=null;
        Token INT115=null;
        Token LPAREN117=null;
        Token char_literal119=null;
        AslParser.expr_return expr113 =null;

        AslParser.funcall_return funcall116 =null;

        AslParser.expr_return expr118 =null;

        AslParser.sensors_return sensors120 =null;


        AslTree b_tree=null;
        AslTree ID111_tree=null;
        AslTree LBRACK112_tree=null;
        AslTree RBRACK114_tree=null;
        AslTree INT115_tree=null;
        AslTree LPAREN117_tree=null;
        AslTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:166:9: ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors )
            int alt25=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
                    alt25=4;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= EQUAL)||LA25_1==GE||LA25_1==GT||(LA25_1 >= LBRACK && LA25_1 <= LE)||(LA25_1 >= LT && LA25_1 <= MUL)||LA25_1==NOT_EQUAL||LA25_1==OR||LA25_1==PLUS||LA25_1==RBRACK||LA25_1==THEN||(LA25_1 >= 62 && LA25_1 <= 64)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt25=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt25=3;
                }
                break;
            case LPAREN:
                {
                alt25=5;
                }
                break;
            case INFRA:
            case SENTIR:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:166:13: ID ( LBRACK ^ expr RBRACK !)?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID111=(Token)match(input,ID,FOLLOW_ID_in_atom1181); 
                    ID111_tree = 
                    (AslTree)adaptor.create(ID111)
                    ;
                    adaptor.addChild(root_0, ID111_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:166:16: ( LBRACK ^ expr RBRACK !)?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==LBRACK) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:166:17: LBRACK ^ expr RBRACK !
                            {
                            LBRACK112=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_atom1184); 
                            LBRACK112_tree = 
                            (AslTree)adaptor.create(LBRACK112)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LBRACK112_tree, root_0);


                            pushFollow(FOLLOW_expr_in_atom1187);
                            expr113=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr113.getTree());

                            RBRACK114=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_atom1189); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:167:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT115=(Token)match(input,INT,FOLLOW_INT_in_atom1206); 
                    INT115_tree = 
                    (AslTree)adaptor.create(INT115)
                    ;
                    adaptor.addChild(root_0, INT115_tree);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:168:13: (b= TRUE |b= FALSE )
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:168:13: (b= TRUE |b= FALSE )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TRUE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==FALSE) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:168:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1223);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:168:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1229);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 168:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:168:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:169:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1252);
                    funcall116=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall116.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:170:13: LPAREN ^ expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1266); 
                    LPAREN117_tree = 
                    (AslTree)adaptor.create(LPAREN117)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LPAREN117_tree, root_0);


                    pushFollow(FOLLOW_expr_in_atom1269);
                    expr118=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr118.getTree());

                    char_literal119=(Token)match(input,62,FOLLOW_62_in_atom1271); 

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:171:13: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_atom1286);
                    sensors120=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors120.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        AslParser.expr_list_return expr_list123 =null;


        AslTree ID121_tree=null;
        AslTree char_literal122_tree=null;
        AslTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:13: ID '(' ( expr_list )? ')'
            {
            ID121=(Token)match(input,ID,FOLLOW_ID_in_funcall1306);  
            stream_ID.add(ID121);


            char_literal122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcall1308);  
            stream_LPAREN.add(char_literal122);


            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:20: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FALSE||LA26_0==ID||LA26_0==INFRA||LA26_0==INT||LA26_0==LPAREN||LA26_0==MINUS||LA26_0==NOT||LA26_0==PLUS||LA26_0==SENTIR||LA26_0==TRUE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1310);
                    expr_list123=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list123.getTree());

                    }
                    break;

            }


            char_literal124=(Token)match(input,62,FOLLOW_62_in_funcall1313);  
            stream_62.add(char_literal124);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 175:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:175:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:179:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal126=null;
        AslParser.expr_return expr125 =null;

        AslParser.expr_return expr127 =null;


        AslTree char_literal126_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:179:10: ( expr ( ',' ! expr )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:179:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1346);
            expr125=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr125.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:179:18: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==63) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/RoboBASIC/src/parser/Asl.g:179:19: ',' ! expr
            	    {
            	    char_literal126=(Token)match(input,63,FOLLOW_63_in_expr_list1349); 

            	    pushFollow(FOLLOW_expr_in_expr_list1352);
            	    expr127=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr127.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func205 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_func208 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_params_in_func210 = new BitSet(new long[]{0x0C7849003D000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_func212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_params233 = new BitSet(new long[]{0x6000000004000000L});
    public static final BitSet FOLLOW_paramlist_in_params235 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_params238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist264 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_paramlist267 = new BitSet(new long[]{0x2000000004000000L});
    public static final BitSet FOLLOW_param_in_paramlist270 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_61_in_param295 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_block_instructions359 = new BitSet(new long[]{0x0C7849003D000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_in_block_instructions361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_assign_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_special_instruction_in_instruction558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIROBOT_in_special_instruction606 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction609 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction611 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction614 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction616 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVAN_in_special_instruction624 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETRO_in_special_instruction632 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOBSTACLE_in_special_instruction640 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction643 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_special_instruction646 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GIRA_in_special_instruction656 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PINTARCOLOR_in_special_instruction664 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ESTADOPINTAR_in_special_instruction667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_special_instruction672 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction675 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction677 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction680 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction682 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction685 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction687 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_special_instruction690 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction695 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_special_instruction697 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_special_instruction705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENTIR_in_sensors716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INFRA_in_sensors722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idtypes_in_assign736 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assign740 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_assign742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idtypes774 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LBRACK_in_idtypes777 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_idtypes780 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_idtypes782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt804 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt807 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt809 = new BitSet(new long[]{0x0C7849003D000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt812 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt815 = new BitSet(new long[]{0x0C7849003D000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt818 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt845 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_while_stmt848 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt850 = new BitSet(new long[]{0x0C7849003D000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt853 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt878 = new BitSet(new long[]{0x0240822854100002L});
    public static final BitSet FOLLOW_expr_in_return_stmt881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read900 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_read903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write923 = new BitSet(new long[]{0x02C0822854100000L});
    public static final BitSet FOLLOW_expr_in_write927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr956 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr959 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_boolterm_in_expr962 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm982 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm985 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm988 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1008 = new BitSet(new long[]{0x0000041102820002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1012 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1017 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_LT_in_boolfact1022 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_LE_in_boolfact1027 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_GT_in_boolfact1032 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_GE_in_boolfact1037 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1061 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1066 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1071 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_term_in_num_expr1075 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_factor_in_term1099 = new BitSet(new long[]{0x000000C000000802L});
    public static final BitSet FOLLOW_MUL_in_term1104 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_DIV_in_term1109 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_MOD_in_term1114 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_factor_in_term1118 = new BitSet(new long[]{0x000000C000000802L});
    public static final BitSet FOLLOW_NOT_in_factor1141 = new BitSet(new long[]{0x0240000854100000L});
    public static final BitSet FOLLOW_PLUS_in_factor1146 = new BitSet(new long[]{0x0240000854100000L});
    public static final BitSet FOLLOW_MINUS_in_factor1151 = new BitSet(new long[]{0x0240000854100000L});
    public static final BitSet FOLLOW_atom_in_factor1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1181 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom1184 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_atom1187 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_atom1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1266 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_atom1269 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_atom1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_atom1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1306 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcall1308 = new BitSet(new long[]{0x4240822854100000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1310 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_funcall1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1346 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_expr_list1349 = new BitSet(new long[]{0x0240822854100000L});
    public static final BitSet FOLLOW_expr_in_expr_list1352 = new BitSet(new long[]{0x8000000000000002L});

}