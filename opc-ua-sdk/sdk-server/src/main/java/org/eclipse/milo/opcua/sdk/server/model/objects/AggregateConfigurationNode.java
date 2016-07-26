/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.model.objects;

import java.util.Optional;

import org.eclipse.milo.opcua.sdk.core.model.objects.AggregateConfigurationType;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.api.UaNodeManager;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyNode;
import org.eclipse.milo.opcua.sdk.core.annotations.UaObjectNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;

@UaObjectNode(typeName = "0:AggregateConfigurationType")
public class AggregateConfigurationNode extends BaseObjectNode implements AggregateConfigurationType {

    public AggregateConfigurationNode(
        UaNodeManager nodeManager,
        NodeId nodeId,
        QualifiedName browseName,
        LocalizedText displayName,
        Optional<LocalizedText> description,
        Optional<UInteger> writeMask,
        Optional<UInteger> userWriteMask,
        UByte eventNotifier) {

        super(nodeManager, nodeId, browseName, displayName, description, writeMask, userWriteMask, eventNotifier);
    }

    @Override
    public Boolean getTreatUncertainAsBad() {
        Optional<Boolean> property = getProperty(AggregateConfigurationType.TREAT_UNCERTAIN_AS_BAD);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getTreatUncertainAsBadNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AggregateConfigurationType.TREAT_UNCERTAIN_AS_BAD.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setTreatUncertainAsBad(Boolean value) {
        setProperty(AggregateConfigurationType.TREAT_UNCERTAIN_AS_BAD, value);
    }

    @Override
    public UByte getPercentDataBad() {
        Optional<UByte> property = getProperty(AggregateConfigurationType.PERCENT_DATA_BAD);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getPercentDataBadNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AggregateConfigurationType.PERCENT_DATA_BAD.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setPercentDataBad(UByte value) {
        setProperty(AggregateConfigurationType.PERCENT_DATA_BAD, value);
    }

    @Override
    public UByte getPercentDataGood() {
        Optional<UByte> property = getProperty(AggregateConfigurationType.PERCENT_DATA_GOOD);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getPercentDataGoodNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AggregateConfigurationType.PERCENT_DATA_GOOD.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setPercentDataGood(UByte value) {
        setProperty(AggregateConfigurationType.PERCENT_DATA_GOOD, value);
    }

    @Override
    public Boolean getUseSlopedExtrapolation() {
        Optional<Boolean> property = getProperty(AggregateConfigurationType.USE_SLOPED_EXTRAPOLATION);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getUseSlopedExtrapolationNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AggregateConfigurationType.USE_SLOPED_EXTRAPOLATION.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setUseSlopedExtrapolation(Boolean value) {
        setProperty(AggregateConfigurationType.USE_SLOPED_EXTRAPOLATION, value);
    }

}
