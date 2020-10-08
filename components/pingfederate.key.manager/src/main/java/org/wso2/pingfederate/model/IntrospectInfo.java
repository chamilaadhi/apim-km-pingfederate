/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.pingfederate.model;

import com.google.gson.annotations.SerializedName;

/**
 * Introspection Response Info.
 */
public class IntrospectInfo {
    @SerializedName("active")
    private boolean active;
    @SerializedName("scope")
    private String scope;
    @SerializedName("exp")
    private long expiry;
    @SerializedName("token_type")
    private String tokenType;
    @SerializedName("username")
    private String username;
    @SerializedName("client_id")
    private String clientId;

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }

    public String getScope() {

        return scope;
    }

    public void setScope(String scope) {

        this.scope = scope;
    }

    public long getExpiry() {

        return expiry;
    }

    public void setExpiry(long expiry) {

        this.expiry = expiry;
    }

    public String getTokenType() {

        return tokenType;
    }

    public void setTokenType(String tokenType) {

        this.tokenType = tokenType;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getClientId() {

        return clientId;
    }

    public void setClientId(String clientId) {

        this.clientId = clientId;
    }
}
