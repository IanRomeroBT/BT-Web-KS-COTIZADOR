<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>COTIZADOR_QUANTICO</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>2d1ea216-70e2-49ad-b3af-e5d55ca439d9</testSuiteGuid>
   <testCaseLink>
      <guid>6bca27c8-0948-4ca5-aee9-529301b133a7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/HOOKS/inicio_sesion_quantico</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>bcb6dfac-dc54-41e8-948f-080d554e5f47</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>eff7e74f-3e11-4e40-9e86-7e33622ef8e3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f3e6f159-8d02-4664-b6dd-67f7343cf40a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/HOOKS/acceder_solicitud_quantico</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>58aa958d-291e-469a-b673-aa476379405e</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>2-2</value>
         </iterationEntity>
         <testDataId>Data Files/FOLIOS</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>58aa958d-291e-469a-b673-aa476379405e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>folio</value>
         <variableId>e10cd55f-5066-43c6-a08f-8a2429470fbf</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>