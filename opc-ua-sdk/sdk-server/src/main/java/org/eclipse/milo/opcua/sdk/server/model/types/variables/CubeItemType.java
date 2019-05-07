/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server.model.types.variables;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.core.ValueRanks;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.structured.AxisInformation;

public interface CubeItemType extends ArrayItemType {
    QualifiedProperty<AxisInformation> Y_AXIS_DEFINITION = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "YAxisDefinition",
        NodeId.parse("ns=0;i=12079"),
        ValueRanks.Scalar,
        AxisInformation.class
    );

    QualifiedProperty<AxisInformation> X_AXIS_DEFINITION = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "XAxisDefinition",
        NodeId.parse("ns=0;i=12079"),
        ValueRanks.Scalar,
        AxisInformation.class
    );

    QualifiedProperty<AxisInformation> Z_AXIS_DEFINITION = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "ZAxisDefinition",
        NodeId.parse("ns=0;i=12079"),
        ValueRanks.Scalar,
        AxisInformation.class
    );

    PropertyType getYAxisDefinitionNode();

    AxisInformation getYAxisDefinition();

    void setYAxisDefinition(AxisInformation value);

    PropertyType getXAxisDefinitionNode();

    AxisInformation getXAxisDefinition();

    void setXAxisDefinition(AxisInformation value);

    PropertyType getZAxisDefinitionNode();

    AxisInformation getZAxisDefinition();

    void setZAxisDefinition(AxisInformation value);
}
