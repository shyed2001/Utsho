prompt --workspace/credentials/app_200942_push_notifications_credentials
begin
--   Manifest
--     CREDENTIAL: App 200942 Push Notifications Credentials
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_imp_workspace.create_credential(
 p_id=>wwv_flow_imp.id(52608691306333297182)
,p_name=>'App 200942 Push Notifications Credentials'
,p_static_id=>'App_200942_Push_Notifications_Credentials'
,p_authentication_type=>'KEY_PAIR'
,p_prompt_on_install=>false
);
wwv_flow_imp.component_end;
end;
/
