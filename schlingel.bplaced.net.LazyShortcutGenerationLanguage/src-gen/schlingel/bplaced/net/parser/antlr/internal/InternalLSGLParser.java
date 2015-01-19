package schlingel.bplaced.net.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import schlingel.bplaced.net.services.LSGLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLSGLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'generator'", "'end'", "'config'", "','", "':'", "'string'", "'int'", "'double'", "'float'", "'char'", "'enum'", "'@generator'", "'('", "')'", "'entity'", "'extends'", "'@annotation'", "'excluding'", "'projection'", "'of'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLSGLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLSGLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLSGLParser.tokenNames; }
    public String getGrammarFileName() { return "../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g"; }



     	private LSGLGrammarAccess grammarAccess;
     	
        public InternalLSGLParser(TokenStream input, LSGLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LSGLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_types_1_0= ruleType ) ) | ( (lv_projections_2_0= ruleProjection ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_generators_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_projections_2_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:79:28: ( ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_types_1_0= ruleType ) ) | ( (lv_projections_2_0= ruleProjection ) ) )* )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:80:1: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_types_1_0= ruleType ) ) | ( (lv_projections_2_0= ruleProjection ) ) )*
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:80:1: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_types_1_0= ruleType ) ) | ( (lv_projections_2_0= ruleProjection ) ) )*
            loop1:
            do {
                int alt1=4;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:80:2: ( (lv_generators_0_0= ruleGenerator ) )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:80:2: ( (lv_generators_0_0= ruleGenerator ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:81:1: (lv_generators_0_0= ruleGenerator )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:81:1: (lv_generators_0_0= ruleGenerator )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:82:3: lv_generators_0_0= ruleGenerator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGeneratorsGeneratorParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGenerator_in_ruleModel131);
            	    lv_generators_0_0=ruleGenerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"generators",
            	              		lv_generators_0_0, 
            	              		"Generator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:99:6: ( (lv_types_1_0= ruleType ) )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:99:6: ( (lv_types_1_0= ruleType ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:100:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:100:1: (lv_types_1_0= ruleType )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:101:3: lv_types_1_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleModel158);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_1_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:118:6: ( (lv_projections_2_0= ruleProjection ) )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:118:6: ( (lv_projections_2_0= ruleProjection ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:119:1: (lv_projections_2_0= ruleProjection )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:119:1: (lv_projections_2_0= ruleProjection )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:120:3: lv_projections_2_0= ruleProjection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getProjectionsProjectionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProjection_in_ruleModel185);
            	    lv_projections_2_0=ruleProjection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"projections",
            	              		lv_projections_2_0, 
            	              		"Projection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGenerator"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:144:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:145:2: (iv_ruleGenerator= ruleGenerator EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:146:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator222);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:153:1: ruleGenerator returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) )* ( (lv_configs_4_0= ruleConfig ) )* otherlv_5= 'end' ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;

        EObject lv_configs_4_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:156:28: ( (otherlv_0= 'def' otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) )* ( (lv_configs_4_0= ruleConfig ) )* otherlv_5= 'end' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:157:1: (otherlv_0= 'def' otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) )* ( (lv_configs_4_0= ruleConfig ) )* otherlv_5= 'end' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:157:1: (otherlv_0= 'def' otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) )* ( (lv_configs_4_0= ruleConfig ) )* otherlv_5= 'end' )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:157:3: otherlv_0= 'def' otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) )* ( (lv_configs_4_0= ruleConfig ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGenerator269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratorAccess().getDefKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleGenerator281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getGeneratorKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:165:1: ( (lv_name_2_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:166:1: (lv_name_2_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:166:1: (lv_name_2_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:167:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGeneratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:183:2: ( (lv_properties_3_0= ruleConfigProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:184:1: (lv_properties_3_0= ruleConfigProperty )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:184:1: (lv_properties_3_0= ruleConfigProperty )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:185:3: lv_properties_3_0= ruleConfigProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGeneratorAccess().getPropertiesConfigPropertyParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfigProperty_in_ruleGenerator324);
            	    lv_properties_3_0=ruleConfigProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_3_0, 
            	              		"ConfigProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:201:3: ( (lv_configs_4_0= ruleConfig ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:202:1: (lv_configs_4_0= ruleConfig )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:202:1: (lv_configs_4_0= ruleConfig )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:203:3: lv_configs_4_0= ruleConfig
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGeneratorAccess().getConfigsConfigParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfig_in_ruleGenerator346);
            	    lv_configs_4_0=ruleConfig();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"configs",
            	              		lv_configs_4_0, 
            	              		"Config");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleGenerator359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGeneratorAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleConfig"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:231:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:232:2: (iv_ruleConfig= ruleConfig EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:233:2: iv_ruleConfig= ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig395);
            iv_ruleConfig=ruleConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:240:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= 'config' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )* otherlv_6= 'end' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:243:28: ( (otherlv_0= 'def' otherlv_1= 'config' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )* otherlv_6= 'end' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:244:1: (otherlv_0= 'def' otherlv_1= 'config' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )* otherlv_6= 'end' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:244:1: (otherlv_0= 'def' otherlv_1= 'config' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )* otherlv_6= 'end' )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:244:3: otherlv_0= 'def' otherlv_1= 'config' ( (lv_name_2_0= RULE_ID ) ) ( (lv_properties_3_0= ruleConfigProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConfig442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getDefKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleConfig454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:252:1: ( (lv_name_2_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:253:1: (lv_name_2_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:253:1: (lv_name_2_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:254:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfig471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConfigRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:270:2: ( (lv_properties_3_0= ruleConfigProperty ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:271:1: (lv_properties_3_0= ruleConfigProperty )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:271:1: (lv_properties_3_0= ruleConfigProperty )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:272:3: lv_properties_3_0= ruleConfigProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigAccess().getPropertiesConfigPropertyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConfigProperty_in_ruleConfig497);
            lv_properties_3_0=ruleConfigProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConfigRule());
              	        }
                     		add(
                     			current, 
                     			"properties",
                      		lv_properties_3_0, 
                      		"ConfigProperty");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:288:2: (otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:288:4: otherlv_4= ',' ( (lv_properties_5_0= ruleConfigProperty ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConfig510); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:292:1: ( (lv_properties_5_0= ruleConfigProperty ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:293:1: (lv_properties_5_0= ruleConfigProperty )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:293:1: (lv_properties_5_0= ruleConfigProperty )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:294:3: lv_properties_5_0= ruleConfigProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfigAccess().getPropertiesConfigPropertyParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfigProperty_in_ruleConfig531);
            	    lv_properties_5_0=ruleConfigProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_5_0, 
            	              		"ConfigProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleConfig545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigProperty"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:322:1: entryRuleConfigProperty returns [EObject current=null] : iv_ruleConfigProperty= ruleConfigProperty EOF ;
    public final EObject entryRuleConfigProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigProperty = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:323:2: (iv_ruleConfigProperty= ruleConfigProperty EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:324:2: iv_ruleConfigProperty= ruleConfigProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleConfigProperty_in_entryRuleConfigProperty581);
            iv_ruleConfigProperty=ruleConfigProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigProperty591); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigProperty"


    // $ANTLR start "ruleConfigProperty"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:331:1: ruleConfigProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:334:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:335:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:335:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:335:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:335:2: ( (lv_name_0_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:336:1: (lv_name_0_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:336:1: (lv_name_0_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:337:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigProperty633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getConfigPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConfigPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConfigProperty650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigPropertyAccess().getColonKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:357:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:358:1: (lv_value_2_0= RULE_STRING )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:358:1: (lv_value_2_0= RULE_STRING )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:359:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigProperty667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getConfigPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConfigPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigProperty"


    // $ANTLR start "entryRuleType"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:383:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:384:2: (iv_ruleType= ruleType EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:385:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType708);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:392:1: ruleType returns [EObject current=null] : ( ( () rulePrimaryType ) | this_Enum_2= ruleEnum | this_Entity_3= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_2 = null;

        EObject this_Entity_3 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:395:28: ( ( ( () rulePrimaryType ) | this_Enum_2= ruleEnum | this_Entity_3= ruleEntity ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:1: ( ( () rulePrimaryType ) | this_Enum_2= ruleEnum | this_Entity_3= ruleEntity )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:1: ( ( () rulePrimaryType ) | this_Enum_2= ruleEnum | this_Entity_3= ruleEntity )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==26) ) {
                    alt5=3;
                }
                else if ( (LA5_2==22) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:2: ( () rulePrimaryType )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:2: ( () rulePrimaryType )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:3: () rulePrimaryType
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:396:3: ()
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:397:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimaryTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryType_in_ruleType769);
                    rulePrimaryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:412:5: this_Enum_2= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getEnumParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleType797);
                    this_Enum_2=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enum_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:422:5: this_Entity_3= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleType824);
                    this_Entity_3=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimaryType"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:438:1: entryRulePrimaryType returns [String current=null] : iv_rulePrimaryType= rulePrimaryType EOF ;
    public final String entryRulePrimaryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryType = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:439:2: (iv_rulePrimaryType= rulePrimaryType EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:440:2: iv_rulePrimaryType= rulePrimaryType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryType_in_entryRulePrimaryType860);
            iv_rulePrimaryType=rulePrimaryType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryType871); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryType"


    // $ANTLR start "rulePrimaryType"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:447:1: rulePrimaryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'double' | kw= 'float' | kw= 'char' ) ;
    public final AntlrDatatypeRuleToken rulePrimaryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:450:28: ( (kw= 'string' | kw= 'int' | kw= 'double' | kw= 'float' | kw= 'char' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:451:1: (kw= 'string' | kw= 'int' | kw= 'double' | kw= 'float' | kw= 'char' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:451:1: (kw= 'string' | kw= 'int' | kw= 'double' | kw= 'float' | kw= 'char' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:452:2: kw= 'string'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_rulePrimaryType909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryTypeAccess().getStringKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:459:2: kw= 'int'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_rulePrimaryType928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryTypeAccess().getIntKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:466:2: kw= 'double'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_rulePrimaryType947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryTypeAccess().getDoubleKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:473:2: kw= 'float'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulePrimaryType966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryTypeAccess().getFloatKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:480:2: kw= 'char'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulePrimaryType985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryTypeAccess().getCharKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryType"


    // $ANTLR start "entryRuleEnum"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:493:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:494:2: (iv_ruleEnum= ruleEnum EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:495:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1025);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1035); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:502:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'def' otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) ( (lv_items_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )* otherlv_6= 'end' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:505:28: ( (otherlv_0= 'def' otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) ( (lv_items_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )* otherlv_6= 'end' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:506:1: (otherlv_0= 'def' otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) ( (lv_items_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )* otherlv_6= 'end' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:506:1: (otherlv_0= 'def' otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) ( (lv_items_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )* otherlv_6= 'end' )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:506:3: otherlv_0= 'def' otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) ( (lv_items_3_0= ruleEnumItem ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )* otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEnum1072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getDefKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEnum1084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getEnumKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:514:1: ( (lv_name_2_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:515:1: (lv_name_2_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:515:1: (lv_name_2_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:516:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:532:2: ( (lv_items_3_0= ruleEnumItem ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:533:1: (lv_items_3_0= ruleEnumItem )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:533:1: (lv_items_3_0= ruleEnumItem )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:534:3: lv_items_3_0= ruleEnumItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumAccess().getItemsEnumItemParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumItem_in_ruleEnum1127);
            lv_items_3_0=ruleEnumItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumRule());
              	        }
                     		add(
                     			current, 
                     			"items",
                      		lv_items_3_0, 
                      		"EnumItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:550:2: (otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:550:4: otherlv_4= ',' ( (lv_items_5_0= ruleEnumItem ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEnum1140); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:554:1: ( (lv_items_5_0= ruleEnumItem ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:555:1: (lv_items_5_0= ruleEnumItem )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:555:1: (lv_items_5_0= ruleEnumItem )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:556:3: lv_items_5_0= ruleEnumItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getItemsEnumItemParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumItem_in_ruleEnum1161);
            	    lv_items_5_0=ruleEnumItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_5_0, 
            	              		"EnumItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnum1175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumItem"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:584:1: entryRuleEnumItem returns [EObject current=null] : iv_ruleEnumItem= ruleEnumItem EOF ;
    public final EObject entryRuleEnumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumItem = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:585:2: (iv_ruleEnumItem= ruleEnumItem EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:586:2: iv_ruleEnumItem= ruleEnumItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumItemRule()); 
            }
            pushFollow(FOLLOW_ruleEnumItem_in_entryRuleEnumItem1211);
            iv_ruleEnumItem=ruleEnumItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumItem1221); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumItem"


    // $ANTLR start "ruleEnumItem"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:593:1: ruleEnumItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:596:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:597:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:597:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:597:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:597:2: ( (lv_name_0_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:598:1: (lv_name_0_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:598:1: (lv_name_0_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:599:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumItem1263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEnumItem1280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumItemAccess().getColonKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:619:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:620:1: (lv_value_2_0= RULE_STRING )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:620:1: (lv_value_2_0= RULE_STRING )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:621:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumItem1297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getEnumItemAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumItem"


    // $ANTLR start "entryRuleEntity"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:645:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:646:2: (iv_ruleEntity= ruleEntity EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:647:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1338);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:654:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )? (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= 'end' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_generators_2_1 = null;

        EObject lv_generators_2_2 = null;

        EObject lv_superClass_8_1 = null;

        EObject lv_superClass_8_2 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:657:28: ( ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )? (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= 'end' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:658:1: ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )? (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= 'end' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:658:1: ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )? (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= 'end' )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:658:2: (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' otherlv_5= 'entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )? ( (lv_attributes_9_0= ruleAttribute ) )? (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= 'end'
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:658:2: (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:658:4: otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')'
            	    {
            	    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEntity1386); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getGeneratorKeyword_0_0());
            	          
            	    }
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEntity1398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_0_1());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:666:1: ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:667:1: ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:667:1: ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:668:1: (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:668:1: (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==11) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==RULE_ID) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:669:3: lv_generators_2_1= ruleGenerator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getEntityAccess().getGeneratorsGeneratorParserRuleCall_0_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGenerator_in_ruleEntity1421);
            	            lv_generators_2_1=ruleGenerator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"generators",
            	                      		lv_generators_2_1, 
            	                      		"Generator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:684:8: lv_generators_2_2= ruleQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getEntityAccess().getGeneratorsQualifiedNameParserRuleCall_0_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1440);
            	            lv_generators_2_2=ruleQualifiedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"generators",
            	                      		lv_generators_2_2, 
            	                      		"QualifiedName");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleEntity1455); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightParenthesisKeyword_0_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleEntity1469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getDefKeyword_1());
                  
            }
            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleEntity1481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEntityKeyword_2());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:714:1: ( (lv_name_6_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:715:1: (lv_name_6_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:715:1: (lv_name_6_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:716:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:732:2: (otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:732:4: otherlv_7= 'extends' ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleEntity1516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:736:1: ( ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) ) )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:737:1: ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:737:1: ( (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName ) )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:738:1: (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:738:1: (lv_superClass_8_1= ruleEntity | lv_superClass_8_2= ruleQualifiedName )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==11||LA10_0==23) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:739:3: lv_superClass_8_1= ruleEntity
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEntityAccess().getSuperClassEntityParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleEntity_in_ruleEntity1539);
                            lv_superClass_8_1=ruleEntity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEntityRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"superClass",
                                      		lv_superClass_8_1, 
                                      		"Entity");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:754:8: lv_superClass_8_2= ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEntityAccess().getSuperClassQualifiedNameParserRuleCall_4_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1558);
                            lv_superClass_8_2=ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEntityRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"superClass",
                                      		lv_superClass_8_2, 
                                      		"QualifiedName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:772:4: ( (lv_attributes_9_0= ruleAttribute ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==11||(LA12_0>=17 && LA12_0<=21)||LA12_0==23||LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:773:1: (lv_attributes_9_0= ruleAttribute )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:773:1: (lv_attributes_9_0= ruleAttribute )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:774:3: lv_attributes_9_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1584);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntityRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_9_0, 
                              		"Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:790:3: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:790:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEntity1598); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:794:1: ( (lv_attributes_11_0= ruleAttribute ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:795:1: (lv_attributes_11_0= ruleAttribute )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:795:1: (lv_attributes_11_0= ruleAttribute )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:796:3: lv_attributes_11_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity1619);
            	    lv_attributes_11_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_11_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleEntity1633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getEndKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:824:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:825:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:826:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1669);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:833:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )* ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) ) ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_5_0=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_type_4_1 = null;

        EObject lv_type_4_2 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:836:28: ( ( (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )* ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) ) ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:837:1: ( (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )* ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) ) ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:837:1: ( (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )* ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) ) ( (lv_name_5_0= RULE_ID ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:837:2: (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )* ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) ) ( (lv_name_5_0= RULE_ID ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:837:2: (otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:837:4: otherlv_0= '@annotation' otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotation ) ) otherlv_3= ')'
            	    {
            	    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAttribute1717); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAnnotationKeyword_0_0());
            	          
            	    }
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_0_1());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:845:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:846:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:846:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:847:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAttribute1750);
            	    lv_annotations_2_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_2_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1762); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_0_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:867:3: ( ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:868:1: ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:868:1: ( (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:869:1: (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:869:1: (lv_type_4_1= ruleType | lv_type_4_2= ruleQualifiedName )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11||(LA15_0>=17 && LA15_0<=21)||LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:870:3: lv_type_4_1= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleAttribute1787);
                    lv_type_4_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_4_1, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:885:8: lv_type_4_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeQualifiedNameParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute1806);
                    lv_type_4_2=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_4_2, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:903:2: ( (lv_name_5_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:904:1: (lv_name_5_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:904:1: (lv_name_5_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:905:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAnnotation"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:929:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:930:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:931:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1867);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1877); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:938:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:941:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:942:1: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:942:1: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:942:2: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:942:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:943:1: (lv_name_0_0= RULE_STRING )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:943:1: (lv_name_0_0= RULE_STRING )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:944:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation1919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationAccess().getNameSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:960:2: (otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:960:4: otherlv_1= ',' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation1937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getCommaKeyword_1_0());
                          
                    }
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:964:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:965:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:965:1: (lv_value_2_0= RULE_STRING )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:966:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation1954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleProjection"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:990:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:991:2: (iv_ruleProjection= ruleProjection EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:992:2: iv_ruleProjection= ruleProjection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectionRule()); 
            }
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection1997);
            iv_ruleProjection=ruleProjection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProjection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection2007); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:999:1: ruleProjection returns [EObject current=null] : ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' ( (lv_excluding_5_0= 'excluding' ) )? otherlv_6= 'projection' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'of' ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) ) ( (lv_attributes_10_0= ruleAttribute ) )* otherlv_11= 'end' ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_excluding_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_generators_2_1 = null;

        EObject lv_generators_2_2 = null;

        EObject lv_entity_9_1 = null;

        EObject lv_entity_9_2 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1002:28: ( ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' ( (lv_excluding_5_0= 'excluding' ) )? otherlv_6= 'projection' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'of' ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) ) ( (lv_attributes_10_0= ruleAttribute ) )* otherlv_11= 'end' ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1003:1: ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' ( (lv_excluding_5_0= 'excluding' ) )? otherlv_6= 'projection' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'of' ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) ) ( (lv_attributes_10_0= ruleAttribute ) )* otherlv_11= 'end' )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1003:1: ( (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' ( (lv_excluding_5_0= 'excluding' ) )? otherlv_6= 'projection' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'of' ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) ) ( (lv_attributes_10_0= ruleAttribute ) )* otherlv_11= 'end' )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1003:2: (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )* otherlv_4= 'def' ( (lv_excluding_5_0= 'excluding' ) )? otherlv_6= 'projection' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= 'of' ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) ) ( (lv_attributes_10_0= ruleAttribute ) )* otherlv_11= 'end'
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1003:2: (otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1003:4: otherlv_0= '@generator' otherlv_1= '(' ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) ) otherlv_3= ')'
            	    {
            	    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleProjection2045); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getGeneratorKeyword_0_0());
            	          
            	    }
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleProjection2057); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getLeftParenthesisKeyword_0_1());
            	          
            	    }
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1011:1: ( ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1012:1: ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1012:1: ( (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName ) )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1013:1: (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1013:1: (lv_generators_2_1= ruleGenerator | lv_generators_2_2= ruleQualifiedName )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==11) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==RULE_ID) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1014:3: lv_generators_2_1= ruleGenerator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProjectionAccess().getGeneratorsGeneratorParserRuleCall_0_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGenerator_in_ruleProjection2080);
            	            lv_generators_2_1=ruleGenerator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProjectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"generators",
            	                      		lv_generators_2_1, 
            	                      		"Generator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1029:8: lv_generators_2_2= ruleQualifiedName
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getProjectionAccess().getGeneratorsQualifiedNameParserRuleCall_0_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProjection2099);
            	            lv_generators_2_2=ruleQualifiedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getProjectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"generators",
            	                      		lv_generators_2_2, 
            	                      		"QualifiedName");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleProjection2114); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProjectionAccess().getRightParenthesisKeyword_0_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleProjection2128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getDefKeyword_1());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1055:1: ( (lv_excluding_5_0= 'excluding' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1056:1: (lv_excluding_5_0= 'excluding' )
                    {
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1056:1: (lv_excluding_5_0= 'excluding' )
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1057:3: lv_excluding_5_0= 'excluding'
                    {
                    lv_excluding_5_0=(Token)match(input,29,FOLLOW_29_in_ruleProjection2146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_excluding_5_0, grammarAccess.getProjectionAccess().getExcludingExcludingKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProjectionRule());
                      	        }
                             		setWithLastConsumed(current, "excluding", true, "excluding");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleProjection2172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getProjectionAccess().getProjectionKeyword_3());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1074:1: ( (lv_name_7_0= RULE_ID ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1075:1: (lv_name_7_0= RULE_ID )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1075:1: (lv_name_7_0= RULE_ID )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1076:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection2189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_7_0, grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProjectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_7_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleProjection2206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getProjectionAccess().getOfKeyword_5());
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1096:1: ( ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1097:1: ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1097:1: ( (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1098:1: (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1098:1: (lv_entity_9_1= ruleEntity | lv_entity_9_2= ruleQualifiedName )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11||LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1099:3: lv_entity_9_1= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProjectionAccess().getEntityEntityParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleProjection2229);
                    lv_entity_9_1=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProjectionRule());
                      	        }
                             		set(
                             			current, 
                             			"entity",
                              		lv_entity_9_1, 
                              		"Entity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1114:8: lv_entity_9_2= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProjectionAccess().getEntityQualifiedNameParserRuleCall_6_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProjection2248);
                    lv_entity_9_2=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProjectionRule());
                      	        }
                             		set(
                             			current, 
                             			"entity",
                              		lv_entity_9_2, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1132:2: ( (lv_attributes_10_0= ruleAttribute ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==11||(LA21_0>=17 && LA21_0<=21)||LA21_0==23||LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1133:1: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1133:1: (lv_attributes_10_0= ruleAttribute )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1134:3: lv_attributes_10_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProjectionAccess().getAttributesAttributeParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleProjection2272);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProjectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_10_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleProjection2285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getProjectionAccess().getEndKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleQualifiedName"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1162:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1163:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1164:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2321);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1171:1: ruleQualifiedName returns [EObject current=null] : ( () this_ID_1= RULE_ID ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1174:28: ( ( () this_ID_1= RULE_ID ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )* ) )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1175:1: ( () this_ID_1= RULE_ID ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )* )
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1175:1: ( () this_ID_1= RULE_ID ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )* )
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1175:2: () this_ID_1= RULE_ID ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )*
            {
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1175:2: ()
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQualifiedNameAccess().getIDAction_0(),
                          current);
                  
            }

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2376); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:1: ( ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) && (synpred1_InternalLSGL())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:2: ( ( '.' )=>otherlv_2= '.' ) this_ID_3= RULE_ID
            	    {
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:2: ( ( '.' )=>otherlv_2= '.' )
            	    // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:3: ( '.' )=>otherlv_2= '.'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName2396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0());
            	          
            	    }

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2408); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // $ANTLR start synpred1_InternalLSGL
    public final void synpred1_InternalLSGL_fragment() throws RecognitionException {   
        // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:3: ( '.' )
        // ../schlingel.bplaced.net.LazyShortcutGenerationLanguage/src-gen/schlingel/bplaced/net/parser/antlr/internal/InternalLSGL.g:1185:5: '.'
        {
        match(input,32,FOLLOW_32_in_synpred1_InternalLSGL2388); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLSGL

    // Delegated rules

    public final boolean synpred1_InternalLSGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLSGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\37\uffff";
    static final String DFA1_eofS =
        "\1\1\36\uffff";
    static final String DFA1_minS =
        "\1\13\1\uffff\1\14\1\uffff\1\30\2\uffff\1\4\1\14\1\31\2\4\1\13\1\4\1\31\1\32\1\20\1\16\1\31\1\5\3\4\1\20\1\5\1\15\1\4\1\13\1\20\1\5\1\15";
    static final String DFA1_maxS =
        "\1\27\1\uffff\1\36\1\uffff\1\30\2\uffff\1\13\1\14\1\40\2\4\1\27\1\15\1\40\1\36\1\20\1\16\1\31\1\5\1\4\1\15\1\4\1\20\1\5\1\17\1\4\1\15\1\20\1\5\1\17";
    static final String DFA1_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\uffff\1\1\1\3\30\uffff";
    static final String DFA1_specialS =
        "\37\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\5\uffff\5\3\1\uffff\1\4",
            "",
            "\1\5\11\uffff\1\3\3\uffff\1\3\2\uffff\2\6",
            "",
            "\1\7",
            "",
            "",
            "\1\11\6\uffff\1\10",
            "\1\12",
            "\1\14\6\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17\13\uffff\1\4",
            "\1\20\6\uffff\1\21\1\uffff\1\22",
            "\1\14\6\uffff\1\13",
            "\1\3\2\uffff\2\6",
            "\1\23",
            "\1\24",
            "\1\14",
            "\1\25",
            "\1\26",
            "\1\20\6\uffff\1\21\1\uffff\1\22",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\33\1\uffff\1\32",
            "\1\34",
            "\1\21\1\uffff\1\22",
            "\1\35",
            "\1\36",
            "\1\33\1\uffff\1\32"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 80:1: ( ( (lv_generators_0_0= ruleGenerator ) ) | ( (lv_types_1_0= ruleType ) ) | ( (lv_projections_2_0= ruleProjection ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleModel131 = new BitSet(new long[]{0x0000000000BE0802L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel158 = new BitSet(new long[]{0x0000000000BE0802L});
    public static final BitSet FOLLOW_ruleProjection_in_ruleModel185 = new BitSet(new long[]{0x0000000000BE0802L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGenerator269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGenerator281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator298 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_ruleConfigProperty_in_ruleGenerator324 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleGenerator346 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_ruleGenerator359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConfig442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfig454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfig471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConfigProperty_in_ruleConfig497 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleConfig510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConfigProperty_in_ruleConfig531 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleConfig545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigProperty_in_entryRuleConfigProperty581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigProperty591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigProperty633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConfigProperty650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigProperty667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryType_in_ruleType769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleType797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryType_in_entryRulePrimaryType860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryType871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimaryType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimaryType928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryType947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimaryType966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryType985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEnum1072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnum1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumItem_in_ruleEnum1127 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleEnum1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumItem_in_ruleEnum1161 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleEnum1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumItem_in_entryRuleEnumItem1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumItem1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumItem1263 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumItem1280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumItem1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntity1386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEntity1398 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleEntity1421 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1440 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEntity1455 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_11_in_ruleEntity1469 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntity1481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1498 = new BitSet(new long[]{0x0000000018BEA810L});
    public static final BitSet FOLLOW_27_in_ruleEntity1516 = new BitSet(new long[]{0x0000000000BE0810L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntity1539 = new BitSet(new long[]{0x0000000010BEA810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1558 = new BitSet(new long[]{0x0000000010BEA810L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1584 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1598 = new BitSet(new long[]{0x0000000010BE0810L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1619 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleEntity1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAttribute1717 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute1750 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1762 = new BitSet(new long[]{0x0000000010BE0810L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute1787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute1806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation1919 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation1937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleProjection2045 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProjection2057 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleProjection2080 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProjection2099 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProjection2114 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_11_in_ruleProjection2128 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleProjection2146 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProjection2172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection2189 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProjection2206 = new BitSet(new long[]{0x0000000000BE0810L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleProjection2229 = new BitSet(new long[]{0x0000000010BE2810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProjection2248 = new BitSet(new long[]{0x0000000010BE2810L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleProjection2272 = new BitSet(new long[]{0x0000000010BE2810L});
    public static final BitSet FOLLOW_13_in_ruleProjection2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2376 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName2396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2408 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_synpred1_InternalLSGL2388 = new BitSet(new long[]{0x0000000000000002L});

}