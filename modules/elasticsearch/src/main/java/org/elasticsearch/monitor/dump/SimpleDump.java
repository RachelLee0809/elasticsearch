/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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

package org.elasticsearch.monitor.dump;

import org.elasticsearch.common.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

/**
 * @author kimchy (Shay Banon)
 */
public class SimpleDump extends AbstractDump {

    private final File location;

    public SimpleDump(long timestamp, String cause, @Nullable Map<String, Object> context, File location) throws FileNotFoundException {
        super(timestamp, cause, context);
        this.location = location;
    }

    @Override protected File doCreateFile(String name) throws DumpException {
        return new File(location, name);
    }

    @Override public void finish() throws DumpException {

    }
}
