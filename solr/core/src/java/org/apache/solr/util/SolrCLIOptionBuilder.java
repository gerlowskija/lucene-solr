/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.util;

import org.apache.commons.cli.OptionBuilder;

/**
 * Used as syntactic sugar for creating {@link SolrCLIOption} instances.
 * 
 * This class matches {@link OptionBuilder} nearly verbatim, with the only caveats being the {@code isInternal}
 * additions.  Unforunately, OptionBuilder is final and doesn't permit extension. 
 */
public class SolrCLIOptionBuilder {

}
