/*
 * Copyright 2018-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.mirromutth.r2dbc.mysql.constant;

/**
 * Values for the capabilities flag bitmask used by the MySQL Client/Server Protocol.
 */
public final class Capabilities {

    /**
     * More secure passwords.
     */
    public static final int LONG_PASSWORD = 1;
    public static final int FOUND_ROWS = 1 << 1;
    public static final int LONG_FLAG = 1 << 2;
    public static final int CONNECT_WITH_DB = 1 << 3;

    /**
     * The deflate compression.
     */
    public static final int COMPRESS = 32;
    public static final int LOCAL_FILES = 128;

    /**
     * WARNING: should ALWAYS enable this option before newer protocol comes out.
     */
    public static final int PROTOCOL_41 = 512;
    public static final int INTERACTIVE = 1024;
    public static final int SSL = 2048;
    public static final int TRANSACTIONS = 8192;
    public static final int RESERVED = 16384;
    public static final int SECURE_CONNECTION = 32768;
    public static final int MULTI_STATEMENTS = 65536;
    public static final int MULTI_RESULTS = 1 << 17;
    public static final int PREPARED_MULTI_RESULTS = 1 << 18;
    public static final int PLUGIN_AUTH = 1 << 19;
    public static final int CONNECT_ATTRS = 1 << 20;

    /**
     * Can use var int sized bytes to encode client data.
     */
    public static final int PLUGIN_AUTH_VAR_INT_SIZED_DATA = 1 << 21;
    public static final int CAN_HANDLE_EXPIRED_PASSWORD = 1 << 22;
    public static final int SESSION_TRACK = 1 << 23;

    /**
     * WARNING: should ALWAYS enable this option. MySQL recommends deprecating EOF messages.
     */
    public static final int DEPRECATE_EOF = 1 << 24;
    /**
     * WARNING: means server MAYBE have NOT metadata in response, should NEVER enable this option.
     */
    public static final int OPTIONAL_RESULT_SET_METADATA = 1 << 25;

    public static final int SSL_VERIFY_SERVER_CERT = 1 << 30;
    public static final int REMEMBER_OPTIONS = 1 << 31;

    private Capabilities() {
    }
}
