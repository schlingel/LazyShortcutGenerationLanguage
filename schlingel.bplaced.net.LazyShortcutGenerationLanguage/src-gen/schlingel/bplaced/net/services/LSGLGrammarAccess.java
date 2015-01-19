/*
* generated by Xtext
*/
package schlingel.bplaced.net.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LSGLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cGeneratorsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cGeneratorsGeneratorParserRuleCall_0_0 = (RuleCall)cGeneratorsAssignment_0.eContents().get(0);
		private final Assignment cTypesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTypesTypeParserRuleCall_1_0 = (RuleCall)cTypesAssignment_1.eContents().get(0);
		private final Assignment cProjectionsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cProjectionsProjectionParserRuleCall_2_0 = (RuleCall)cProjectionsAssignment_2.eContents().get(0);
		
		//Model:
		//	(generators+=Generator | types+=Type | projections+=Projection)*;
		public ParserRule getRule() { return rule; }

		//(generators+=Generator | types+=Type | projections+=Projection)*
		public Alternatives getAlternatives() { return cAlternatives; }

		//generators+=Generator
		public Assignment getGeneratorsAssignment_0() { return cGeneratorsAssignment_0; }

		//Generator
		public RuleCall getGeneratorsGeneratorParserRuleCall_0_0() { return cGeneratorsGeneratorParserRuleCall_0_0; }

		//types+=Type
		public Assignment getTypesAssignment_1() { return cTypesAssignment_1; }

		//Type
		public RuleCall getTypesTypeParserRuleCall_1_0() { return cTypesTypeParserRuleCall_1_0; }

		//projections+=Projection
		public Assignment getProjectionsAssignment_2() { return cProjectionsAssignment_2; }

		//Projection
		public RuleCall getProjectionsProjectionParserRuleCall_2_0() { return cProjectionsProjectionParserRuleCall_2_0; }
	}

	public class GeneratorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Generator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGeneratorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cPropertiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertiesConfigPropertyParserRuleCall_3_0 = (RuleCall)cPropertiesAssignment_3.eContents().get(0);
		private final Assignment cConfigsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConfigsConfigParserRuleCall_4_0 = (RuleCall)cConfigsAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Generator:
		//	"def" "generator" name=ID properties+=ConfigProperty* configs+=Config* "end";
		public ParserRule getRule() { return rule; }

		//"def" "generator" name=ID properties+=ConfigProperty* configs+=Config* "end"
		public Group getGroup() { return cGroup; }

		//"def"
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }

		//"generator"
		public Keyword getGeneratorKeyword_1() { return cGeneratorKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//properties+=ConfigProperty*
		public Assignment getPropertiesAssignment_3() { return cPropertiesAssignment_3; }

		//ConfigProperty
		public RuleCall getPropertiesConfigPropertyParserRuleCall_3_0() { return cPropertiesConfigPropertyParserRuleCall_3_0; }

		//configs+=Config*
		public Assignment getConfigsAssignment_4() { return cConfigsAssignment_4; }

		//Config
		public RuleCall getConfigsConfigParserRuleCall_4_0() { return cConfigsConfigParserRuleCall_4_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class ConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Config");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cConfigKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cPropertiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertiesConfigPropertyParserRuleCall_3_0 = (RuleCall)cPropertiesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPropertiesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPropertiesConfigPropertyParserRuleCall_4_1_0 = (RuleCall)cPropertiesAssignment_4_1.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Config:
		//	"def" "config" name=ID properties+=ConfigProperty ("," properties+=ConfigProperty)* "end";
		public ParserRule getRule() { return rule; }

		//"def" "config" name=ID properties+=ConfigProperty ("," properties+=ConfigProperty)* "end"
		public Group getGroup() { return cGroup; }

		//"def"
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }

		//"config"
		public Keyword getConfigKeyword_1() { return cConfigKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//properties+=ConfigProperty
		public Assignment getPropertiesAssignment_3() { return cPropertiesAssignment_3; }

		//ConfigProperty
		public RuleCall getPropertiesConfigPropertyParserRuleCall_3_0() { return cPropertiesConfigPropertyParserRuleCall_3_0; }

		//("," properties+=ConfigProperty)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//properties+=ConfigProperty
		public Assignment getPropertiesAssignment_4_1() { return cPropertiesAssignment_4_1; }

		//ConfigProperty
		public RuleCall getPropertiesConfigPropertyParserRuleCall_4_1_0() { return cPropertiesConfigPropertyParserRuleCall_4_1_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class ConfigPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ConfigProperty:
		//	name=ID ":" value=STRING;
		public ParserRule getRule() { return rule; }

		//name=ID ":" value=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cTypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cPrimaryTypeParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cEnumParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type:
		//	{Type} PrimaryType | Enum | Entity;
		public ParserRule getRule() { return rule; }

		//{Type} PrimaryType | Enum | Entity
		public Alternatives getAlternatives() { return cAlternatives; }

		//{Type} PrimaryType
		public Group getGroup_0() { return cGroup_0; }

		//{Type}
		public Action getTypeAction_0_0() { return cTypeAction_0_0; }

		//PrimaryType
		public RuleCall getPrimaryTypeParserRuleCall_0_1() { return cPrimaryTypeParserRuleCall_0_1; }

		//Enum
		public RuleCall getEnumParserRuleCall_1() { return cEnumParserRuleCall_1; }

		//Entity
		public RuleCall getEntityParserRuleCall_2() { return cEntityParserRuleCall_2; }
	}

	public class PrimaryTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIntKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDoubleKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cFloatKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cCharKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//PrimaryType:
		//	"string" | "int" | "double" | "float" | "char";
		public ParserRule getRule() { return rule; }

		//"string" | "int" | "double" | "float" | "char"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"string"
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }

		//"int"
		public Keyword getIntKeyword_1() { return cIntKeyword_1; }

		//"double"
		public Keyword getDoubleKeyword_2() { return cDoubleKeyword_2; }

		//"float"
		public Keyword getFloatKeyword_3() { return cFloatKeyword_3; }

		//"char"
		public Keyword getCharKeyword_4() { return cCharKeyword_4; }
	}

	public class EnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Enum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cItemsEnumItemParserRuleCall_3_0 = (RuleCall)cItemsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cItemsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cItemsEnumItemParserRuleCall_4_1_0 = (RuleCall)cItemsAssignment_4_1.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Enum:
		//	"def" "enum" name=ID items+=EnumItem ("," items+=EnumItem)* "end";
		public ParserRule getRule() { return rule; }

		//"def" "enum" name=ID items+=EnumItem ("," items+=EnumItem)* "end"
		public Group getGroup() { return cGroup; }

		//"def"
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//items+=EnumItem
		public Assignment getItemsAssignment_3() { return cItemsAssignment_3; }

		//EnumItem
		public RuleCall getItemsEnumItemParserRuleCall_3_0() { return cItemsEnumItemParserRuleCall_3_0; }

		//("," items+=EnumItem)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//items+=EnumItem
		public Assignment getItemsAssignment_4_1() { return cItemsAssignment_4_1; }

		//EnumItem
		public RuleCall getItemsEnumItemParserRuleCall_4_1_0() { return cItemsEnumItemParserRuleCall_4_1_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class EnumItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//EnumItem:
		//	name=ID ":" value=STRING;
		public ParserRule getRule() { return rule; }

		//name=ID ":" value=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cGeneratorKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cGeneratorsAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final Alternatives cGeneratorsAlternatives_0_2_0 = (Alternatives)cGeneratorsAssignment_0_2.eContents().get(0);
		private final RuleCall cGeneratorsGeneratorParserRuleCall_0_2_0_0 = (RuleCall)cGeneratorsAlternatives_0_2_0.eContents().get(0);
		private final RuleCall cGeneratorsQualifiedNameParserRuleCall_0_2_0_1 = (RuleCall)cGeneratorsAlternatives_0_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cEntityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSuperClassAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Alternatives cSuperClassAlternatives_4_1_0 = (Alternatives)cSuperClassAssignment_4_1.eContents().get(0);
		private final RuleCall cSuperClassEntityParserRuleCall_4_1_0_0 = (RuleCall)cSuperClassAlternatives_4_1_0.eContents().get(0);
		private final RuleCall cSuperClassQualifiedNameParserRuleCall_4_1_0_1 = (RuleCall)cSuperClassAlternatives_4_1_0.eContents().get(1);
		private final Assignment cAttributesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributesAttributeParserRuleCall_5_0 = (RuleCall)cAttributesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cAttributesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_6_1_0 = (RuleCall)cAttributesAssignment_6_1.eContents().get(0);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Entity:
		//	("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" "entity" name=ID ("extends" superClass=(Entity |
		//	QualifiedName))? attributes+=Attribute? ("," attributes+=Attribute)* "end";
		public ParserRule getRule() { return rule; }

		//("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" "entity" name=ID ("extends" superClass=(Entity |
		//QualifiedName))? attributes+=Attribute? ("," attributes+=Attribute)* "end"
		public Group getGroup() { return cGroup; }

		//("@generator" "(" generators+=(Generator | QualifiedName) ")")*
		public Group getGroup_0() { return cGroup_0; }

		//"@generator"
		public Keyword getGeneratorKeyword_0_0() { return cGeneratorKeyword_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }

		//generators+=(Generator | QualifiedName)
		public Assignment getGeneratorsAssignment_0_2() { return cGeneratorsAssignment_0_2; }

		//Generator | QualifiedName
		public Alternatives getGeneratorsAlternatives_0_2_0() { return cGeneratorsAlternatives_0_2_0; }

		//Generator
		public RuleCall getGeneratorsGeneratorParserRuleCall_0_2_0_0() { return cGeneratorsGeneratorParserRuleCall_0_2_0_0; }

		//QualifiedName
		public RuleCall getGeneratorsQualifiedNameParserRuleCall_0_2_0_1() { return cGeneratorsQualifiedNameParserRuleCall_0_2_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }

		//"def"
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }

		//"entity"
		public Keyword getEntityKeyword_2() { return cEntityKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("extends" superClass=(Entity | QualifiedName))?
		public Group getGroup_4() { return cGroup_4; }

		//"extends"
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }

		//superClass=(Entity | QualifiedName)
		public Assignment getSuperClassAssignment_4_1() { return cSuperClassAssignment_4_1; }

		//Entity | QualifiedName
		public Alternatives getSuperClassAlternatives_4_1_0() { return cSuperClassAlternatives_4_1_0; }

		//Entity
		public RuleCall getSuperClassEntityParserRuleCall_4_1_0_0() { return cSuperClassEntityParserRuleCall_4_1_0_0; }

		//QualifiedName
		public RuleCall getSuperClassQualifiedNameParserRuleCall_4_1_0_1() { return cSuperClassQualifiedNameParserRuleCall_4_1_0_1; }

		//attributes+=Attribute?
		public Assignment getAttributesAssignment_5() { return cAttributesAssignment_5; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_5_0() { return cAttributesAttributeParserRuleCall_5_0; }

		//("," attributes+=Attribute)*
		public Group getGroup_6() { return cGroup_6; }

		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }

		//attributes+=Attribute
		public Assignment getAttributesAssignment_6_1() { return cAttributesAssignment_6_1; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_6_1_0() { return cAttributesAttributeParserRuleCall_6_1_0; }

		//"end"
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cAnnotationKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_2_0 = (RuleCall)cAnnotationsAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTypeAlternatives_1_0 = (Alternatives)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_1_0_0 = (RuleCall)cTypeAlternatives_1_0.eContents().get(0);
		private final RuleCall cTypeQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeAlternatives_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Attribute:
		//	("@annotation" "(" annotations+=Annotation ")")* type=(Type | QualifiedName) name=ID;
		public ParserRule getRule() { return rule; }

		//("@annotation" "(" annotations+=Annotation ")")* type=(Type | QualifiedName) name=ID
		public Group getGroup() { return cGroup; }

		//("@annotation" "(" annotations+=Annotation ")")*
		public Group getGroup_0() { return cGroup_0; }

		//"@annotation"
		public Keyword getAnnotationKeyword_0_0() { return cAnnotationKeyword_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }

		//annotations+=Annotation
		public Assignment getAnnotationsAssignment_0_2() { return cAnnotationsAssignment_0_2; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_2_0() { return cAnnotationsAnnotationParserRuleCall_0_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }

		//type=(Type | QualifiedName)
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//Type | QualifiedName
		public Alternatives getTypeAlternatives_1_0() { return cTypeAlternatives_1_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_1_0_0() { return cTypeTypeParserRuleCall_1_0_0; }

		//QualifiedName
		public RuleCall getTypeQualifiedNameParserRuleCall_1_0_1() { return cTypeQualifiedNameParserRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		
		//Annotation:
		//	name=STRING ("," value=STRING)?;
		public ParserRule getRule() { return rule; }

		//name=STRING ("," value=STRING)?
		public Group getGroup() { return cGroup; }

		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }

		//("," value=STRING)?
		public Group getGroup_1() { return cGroup_1; }

		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }

		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }
	}

	public class ProjectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Projection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cGeneratorKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cGeneratorsAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final Alternatives cGeneratorsAlternatives_0_2_0 = (Alternatives)cGeneratorsAssignment_0_2.eContents().get(0);
		private final RuleCall cGeneratorsGeneratorParserRuleCall_0_2_0_0 = (RuleCall)cGeneratorsAlternatives_0_2_0.eContents().get(0);
		private final RuleCall cGeneratorsQualifiedNameParserRuleCall_0_2_0_1 = (RuleCall)cGeneratorsAlternatives_0_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExcludingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cExcludingExcludingKeyword_2_0 = (Keyword)cExcludingAssignment_2.eContents().get(0);
		private final Keyword cProjectionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cOfKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cEntityAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final Alternatives cEntityAlternatives_6_0 = (Alternatives)cEntityAssignment_6.eContents().get(0);
		private final RuleCall cEntityEntityParserRuleCall_6_0_0 = (RuleCall)cEntityAlternatives_6_0.eContents().get(0);
		private final RuleCall cEntityQualifiedNameParserRuleCall_6_0_1 = (RuleCall)cEntityAlternatives_6_0.eContents().get(1);
		private final Assignment cAttributesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAttributesAttributeParserRuleCall_7_0 = (RuleCall)cAttributesAssignment_7.eContents().get(0);
		private final Keyword cEndKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Projection:
		//	("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" excluding?="excluding"? "projection" name=ID
		//	"of" entity=(Entity | QualifiedName) attributes+=Attribute* "end";
		public ParserRule getRule() { return rule; }

		//("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" excluding?="excluding"? "projection" name=ID "of"
		//entity=(Entity | QualifiedName) attributes+=Attribute* "end"
		public Group getGroup() { return cGroup; }

		//("@generator" "(" generators+=(Generator | QualifiedName) ")")*
		public Group getGroup_0() { return cGroup_0; }

		//"@generator"
		public Keyword getGeneratorKeyword_0_0() { return cGeneratorKeyword_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }

		//generators+=(Generator | QualifiedName)
		public Assignment getGeneratorsAssignment_0_2() { return cGeneratorsAssignment_0_2; }

		//Generator | QualifiedName
		public Alternatives getGeneratorsAlternatives_0_2_0() { return cGeneratorsAlternatives_0_2_0; }

		//Generator
		public RuleCall getGeneratorsGeneratorParserRuleCall_0_2_0_0() { return cGeneratorsGeneratorParserRuleCall_0_2_0_0; }

		//QualifiedName
		public RuleCall getGeneratorsQualifiedNameParserRuleCall_0_2_0_1() { return cGeneratorsQualifiedNameParserRuleCall_0_2_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }

		//"def"
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }

		//excluding?="excluding"?
		public Assignment getExcludingAssignment_2() { return cExcludingAssignment_2; }

		//"excluding"
		public Keyword getExcludingExcludingKeyword_2_0() { return cExcludingExcludingKeyword_2_0; }

		//"projection"
		public Keyword getProjectionKeyword_3() { return cProjectionKeyword_3; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//"of"
		public Keyword getOfKeyword_5() { return cOfKeyword_5; }

		//entity=(Entity | QualifiedName)
		public Assignment getEntityAssignment_6() { return cEntityAssignment_6; }

		//Entity | QualifiedName
		public Alternatives getEntityAlternatives_6_0() { return cEntityAlternatives_6_0; }

		//Entity
		public RuleCall getEntityEntityParserRuleCall_6_0_0() { return cEntityEntityParserRuleCall_6_0_0; }

		//QualifiedName
		public RuleCall getEntityQualifiedNameParserRuleCall_6_0_1() { return cEntityQualifiedNameParserRuleCall_6_0_1; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_7() { return cAttributesAssignment_7; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_7_0() { return cAttributesAttributeParserRuleCall_7_0; }

		//"end"
		public Keyword getEndKeyword_8() { return cEndKeyword_8; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIDAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//QualifiedName returns STRING:
		//	{ID} ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//{ID} ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//{ID}
		public Action getIDAction_0() { return cIDAction_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//(=> "." ID)*
		public Group getGroup_2() { return cGroup_2; }

		//=> "."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	
	
	private final ModelElements pModel;
	private final GeneratorElements pGenerator;
	private final ConfigElements pConfig;
	private final ConfigPropertyElements pConfigProperty;
	private final TypeElements pType;
	private final PrimaryTypeElements pPrimaryType;
	private final EnumElements pEnum;
	private final EnumItemElements pEnumItem;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final AnnotationElements pAnnotation;
	private final ProjectionElements pProjection;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LSGLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGenerator = new GeneratorElements();
		this.pConfig = new ConfigElements();
		this.pConfigProperty = new ConfigPropertyElements();
		this.pType = new TypeElements();
		this.pPrimaryType = new PrimaryTypeElements();
		this.pEnum = new EnumElements();
		this.pEnumItem = new EnumItemElements();
		this.pEntity = new EntityElements();
		this.pAttribute = new AttributeElements();
		this.pAnnotation = new AnnotationElements();
		this.pProjection = new ProjectionElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("schlingel.bplaced.net.LSGL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	(generators+=Generator | types+=Type | projections+=Projection)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Generator:
	//	"def" "generator" name=ID properties+=ConfigProperty* configs+=Config* "end";
	public GeneratorElements getGeneratorAccess() {
		return pGenerator;
	}
	
	public ParserRule getGeneratorRule() {
		return getGeneratorAccess().getRule();
	}

	//Config:
	//	"def" "config" name=ID properties+=ConfigProperty ("," properties+=ConfigProperty)* "end";
	public ConfigElements getConfigAccess() {
		return pConfig;
	}
	
	public ParserRule getConfigRule() {
		return getConfigAccess().getRule();
	}

	//ConfigProperty:
	//	name=ID ":" value=STRING;
	public ConfigPropertyElements getConfigPropertyAccess() {
		return pConfigProperty;
	}
	
	public ParserRule getConfigPropertyRule() {
		return getConfigPropertyAccess().getRule();
	}

	//Type:
	//	{Type} PrimaryType | Enum | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//PrimaryType:
	//	"string" | "int" | "double" | "float" | "char";
	public PrimaryTypeElements getPrimaryTypeAccess() {
		return pPrimaryType;
	}
	
	public ParserRule getPrimaryTypeRule() {
		return getPrimaryTypeAccess().getRule();
	}

	//Enum:
	//	"def" "enum" name=ID items+=EnumItem ("," items+=EnumItem)* "end";
	public EnumElements getEnumAccess() {
		return pEnum;
	}
	
	public ParserRule getEnumRule() {
		return getEnumAccess().getRule();
	}

	//EnumItem:
	//	name=ID ":" value=STRING;
	public EnumItemElements getEnumItemAccess() {
		return pEnumItem;
	}
	
	public ParserRule getEnumItemRule() {
		return getEnumItemAccess().getRule();
	}

	//Entity:
	//	("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" "entity" name=ID ("extends" superClass=(Entity |
	//	QualifiedName))? attributes+=Attribute? ("," attributes+=Attribute)* "end";
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Attribute:
	//	("@annotation" "(" annotations+=Annotation ")")* type=(Type | QualifiedName) name=ID;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Annotation:
	//	name=STRING ("," value=STRING)?;
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//Projection:
	//	("@generator" "(" generators+=(Generator | QualifiedName) ")")* "def" excluding?="excluding"? "projection" name=ID
	//	"of" entity=(Entity | QualifiedName) attributes+=Attribute* "end";
	public ProjectionElements getProjectionAccess() {
		return pProjection;
	}
	
	public ParserRule getProjectionRule() {
		return getProjectionAccess().getRule();
	}

	//QualifiedName returns STRING:
	//	{ID} ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
