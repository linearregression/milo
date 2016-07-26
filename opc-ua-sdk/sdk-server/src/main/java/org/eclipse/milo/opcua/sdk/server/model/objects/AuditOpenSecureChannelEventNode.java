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

import org.eclipse.milo.opcua.sdk.core.model.objects.AuditOpenSecureChannelEventType;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.api.UaNodeManager;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyNode;
import org.eclipse.milo.opcua.sdk.core.annotations.UaObjectNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MessageSecurityMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.SecurityTokenRequestType;

@UaObjectNode(typeName = "0:AuditOpenSecureChannelEventType")
public class AuditOpenSecureChannelEventNode extends AuditChannelEventNode implements AuditOpenSecureChannelEventType {

    public AuditOpenSecureChannelEventNode(
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
    public ByteString getClientCertificate() {
        Optional<ByteString> property = getProperty(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getClientCertificateNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setClientCertificate(ByteString value) {
        setProperty(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE, value);
    }

    @Override
    public String getClientCertificateThumbprint() {
        Optional<String> property = getProperty(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE_THUMBPRINT);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getClientCertificateThumbprintNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE_THUMBPRINT.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setClientCertificateThumbprint(String value) {
        setProperty(AuditOpenSecureChannelEventType.CLIENT_CERTIFICATE_THUMBPRINT, value);
    }

    @Override
    public SecurityTokenRequestType getRequestType() {
        Optional<SecurityTokenRequestType> property = getProperty(AuditOpenSecureChannelEventType.REQUEST_TYPE);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getRequestTypeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.REQUEST_TYPE.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setRequestType(SecurityTokenRequestType value) {
        setProperty(AuditOpenSecureChannelEventType.REQUEST_TYPE, value);
    }

    @Override
    public String getSecurityPolicyUri() {
        Optional<String> property = getProperty(AuditOpenSecureChannelEventType.SECURITY_POLICY_URI);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getSecurityPolicyUriNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.SECURITY_POLICY_URI.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setSecurityPolicyUri(String value) {
        setProperty(AuditOpenSecureChannelEventType.SECURITY_POLICY_URI, value);
    }

    @Override
    public MessageSecurityMode getSecurityMode() {
        Optional<MessageSecurityMode> property = getProperty(AuditOpenSecureChannelEventType.SECURITY_MODE);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getSecurityModeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.SECURITY_MODE.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setSecurityMode(MessageSecurityMode value) {
        setProperty(AuditOpenSecureChannelEventType.SECURITY_MODE, value);
    }

    @Override
    public Double getRequestedLifetime() {
        Optional<Double> property = getProperty(AuditOpenSecureChannelEventType.REQUESTED_LIFETIME);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getRequestedLifetimeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditOpenSecureChannelEventType.REQUESTED_LIFETIME.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setRequestedLifetime(Double value) {
        setProperty(AuditOpenSecureChannelEventType.REQUESTED_LIFETIME, value);
    }

}
