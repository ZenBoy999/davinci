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

package edp.davinci.model;

import edp.davinci.common.model.RecordInfo;
import lombok.Data;

@Data
public class Widget extends RecordInfo<Widget> {
    private Long id;

    private String name;

    private String description;

    private Long viewId;

    private Long projectId;

    private Long type;

    private Boolean publish = false;

    private String config;

}