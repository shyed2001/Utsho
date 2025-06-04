prompt --application/shared_components/logic/application_settings
begin
--   Manifest
--     APPLICATION SETTINGS: 200942
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_app_setting(
 p_id=>wwv_flow_imp.id(52608370168958296098)
,p_name=>'FEEDBACK_ATTACHMENTS_YN'
,p_value=>'Y'
,p_is_required=>'N'
,p_valid_values=>'Y, N'
,p_on_upgrade_keep_value=>true
,p_required_patch=>wwv_flow_imp.id(52608366591039296092)
,p_version_scn=>15629546018928
);
wwv_flow_imp_shared.create_app_setting(
 p_id=>wwv_flow_imp.id(52608370493552296099)
,p_name=>'ACCESS_CONTROL_SCOPE'
,p_value=>'ACL_ONLY'
,p_is_required=>'N'
,p_valid_values=>'ACL_ONLY, ALL_USERS'
,p_on_upgrade_keep_value=>true
,p_required_patch=>wwv_flow_imp.id(52608366355375296092)
,p_comments=>'The default access level given to authenticated users who are not in the access control list'
,p_version_scn=>15629546018957
);
wwv_flow_imp.component_end;
end;
/
