package schlingel.bplaced.net.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import schlingel.bplaced.net.lSGL.Annotation;
import schlingel.bplaced.net.lSGL.Attribute;
import schlingel.bplaced.net.lSGL.Config;
import schlingel.bplaced.net.lSGL.ConfigProperty;
import schlingel.bplaced.net.lSGL.Entity;
import schlingel.bplaced.net.lSGL.EnumItem;
import schlingel.bplaced.net.lSGL.Generator;
import schlingel.bplaced.net.lSGL.ID;
import schlingel.bplaced.net.lSGL.LSGLPackage;
import schlingel.bplaced.net.lSGL.Model;
import schlingel.bplaced.net.lSGL.Projection;
import schlingel.bplaced.net.lSGL.Type;
import schlingel.bplaced.net.services.LSGLGrammarAccess;

@SuppressWarnings("all")
public class LSGLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LSGLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LSGLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LSGLPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.CONFIG:
				if(context == grammarAccess.getConfigRule()) {
					sequence_Config(context, (Config) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.CONFIG_PROPERTY:
				if(context == grammarAccess.getConfigPropertyRule()) {
					sequence_ConfigProperty(context, (ConfigProperty) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Enum(context, (schlingel.bplaced.net.lSGL.Enum) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.ENUM_ITEM:
				if(context == grammarAccess.getEnumItemRule()) {
					sequence_EnumItem(context, (EnumItem) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.GENERATOR:
				if(context == grammarAccess.getGeneratorRule()) {
					sequence_Generator(context, (Generator) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.ID:
				if(context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (ID) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.PROJECTION:
				if(context == grammarAccess.getProjectionRule()) {
					sequence_Projection(context, (Projection) semanticObject); 
					return; 
				}
				else break;
			case LSGLPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* (type=Type | type=QualifiedName) name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_ConfigProperty(EObject context, ConfigProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LSGLPackage.Literals.CONFIG_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LSGLPackage.Literals.CONFIG_PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, LSGLPackage.Literals.CONFIG_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LSGLPackage.Literals.CONFIG_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigPropertyAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigPropertyAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=ConfigProperty properties+=ConfigProperty*)
	 */
	protected void sequence_Config(EObject context, Config semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (generators+=Generator | generators+=QualifiedName)* 
	 *         name=ID 
	 *         (superClass=Entity | superClass=QualifiedName)? 
	 *         attributes+=Attribute? 
	 *         attributes+=Attribute*
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_EnumItem(EObject context, EnumItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LSGLPackage.Literals.ENUM_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LSGLPackage.Literals.ENUM_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, LSGLPackage.Literals.ENUM_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LSGLPackage.Literals.ENUM_ITEM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumItemAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumItemAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID items+=EnumItem items+=EnumItem*)
	 */
	protected void sequence_Enum(EObject context, schlingel.bplaced.net.lSGL.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=ConfigProperty* configs+=Config*)
	 */
	protected void sequence_Generator(EObject context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (generators+=Generator | types+=Type | projections+=Projection)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (generators+=Generator | generators+=QualifiedName)* 
	 *         excluding?='excluding'? 
	 *         name=ID 
	 *         (entity=Entity | entity=QualifiedName) 
	 *         attributes+=Attribute*
	 *     )
	 */
	protected void sequence_Projection(EObject context, Projection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ID}
	 */
	protected void sequence_QualifiedName(EObject context, ID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Type}
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
