<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>COTIZADOR_UNIFIN</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>97913d7d-71a4-4dad-9961-1c48616849ce</testSuiteGuid>
   <testCaseLink>
      <guid>15f38924-48eb-43e0-8161-b963fde7f8cb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/HOOKS/iniciar_sesion_unifin</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f0033569-5bc5-4d95-8bac-b163e45c6535</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c55c22e4-e691-4a18-a873-2d782ba10cf5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/HOOKS/acceder_cotizador_unifin</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>94eb0f70-f4f2-473f-8ba0-184a2109aef5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UNIFIN/SC01-datos_generales</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>99626fb7-4247-4ba2-8b7f-720db182b5a1</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/CLIENTES_PENDIENTES</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>99626fb7-4247-4ba2-8b7f-720db182b5a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>cliente</value>
         <variableId>d4353a56-3816-4fbd-af0b-bb798d158309</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>7be5beef-ddea-4cb7-bf11-8be02299fa85</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UNIFIN/SC02-datos_activo</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>12aa5c58-e2f1-4c7b-a096-8c2a68116de0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UNIFIN/SC03-datos_condiciones</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>5b231f0e-4eb5-44ea-a9c2-a13f5192abb2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UNIFIN/SC04-datos_seguro</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>3af7380e-40c6-42f9-af36-02f3c7a6dc01</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>79f599ff-5116-4193-8db3-74fc1f98ef44</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/UNIFIN/SC05-cotizar_seguro</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
