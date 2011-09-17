// Copyright 2011 Google Inc. All Rights Reseved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.testing.testify.risk.frontend.shared.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.testing.testify.risk.frontend.model.Project;

/**
 * Interface for service which can create a test project.
 *
 * @author jimr@google.com (Jim Reardon)
 */
@RemoteServiceRelativePath("service/testprojectcreator")
public interface TestProjectCreatorRpc extends RemoteService {
  public Project createTestProject();
  public void createStandardDataSources();
}
