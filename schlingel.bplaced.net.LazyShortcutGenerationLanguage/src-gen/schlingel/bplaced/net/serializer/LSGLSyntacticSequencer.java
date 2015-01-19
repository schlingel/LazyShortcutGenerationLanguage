package schlingel.bplaced.net.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import schlingel.bplaced.net.services.LSGLGrammarAccess;

@SuppressWarnings("all")
public class LSGLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LSGLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_QualifiedName___FullStopKeyword_2_0_IDTerminalRuleCall_2_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LSGLGrammarAccess) access;
		match_QualifiedName___FullStopKeyword_2_0_IDTerminalRuleCall_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrimaryTypeRule())
			return getPrimaryTypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * PrimaryType:
	 * 	'string' | 'int' | 'double' | 'float' | 'char'
	 * ;
	 */
	protected String getPrimaryTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "string";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_QualifiedName___FullStopKeyword_2_0_IDTerminalRuleCall_2_1__a.equals(syntax))
				emit_QualifiedName___FullStopKeyword_2_0_IDTerminalRuleCall_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('.' ID)*
	 */
	protected void emit_QualifiedName___FullStopKeyword_2_0_IDTerminalRuleCall_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
