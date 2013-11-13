package org.modelexecution.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.modelexecution.services.AlfGrammarAccess;

@SuppressWarnings("all")
public class AlfSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlfGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SequenceElementListCompletion_CommaKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlfGrammarAccess) access;
		match_SequenceElementListCompletion_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getSequenceElementListCompletionAccess().getCommaKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SequenceElementListCompletion_CommaKeyword_2_q.equals(syntax))
				emit_SequenceElementListCompletion_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_SequenceElementListCompletion_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
