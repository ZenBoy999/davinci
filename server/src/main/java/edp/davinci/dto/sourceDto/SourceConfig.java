/*
 * <<
 * Davinci
 * ==
 * Copyright (C) 2016 - 2018 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * >>
 */

package edp.davinci.dto.sourceDto;

import edp.davinci.model.Source;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SourceConfig {

    private String username;

    private String password;

    @NotBlank(message = "connection url cannot be EMPTY")
    private String url;

    private String parameters;


    public SourceConfig(Source source) {
        this.username = source.getUsername();
        this.password = source.getPassword();
        this.url = source.getJdbcUrl();
        this.parameters = source.getConfigParams();
    }

    public SourceConfig(String username, String password, String url, String parameters) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.parameters = parameters;
    }

    public SourceConfig() {
    }
}
