prompt --application/shared_components/security/app_access_control/administrator
begin
--   Manifest
--     ACL ROLE: Administrator
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_acl_role(
 p_id=>wwv_flow_imp.id(52608368777204296095)
,p_static_id=>'ADMINISTRATOR'
,p_name=>'Administrator'
,p_description=>'Role assigned to application administrators.'
,p_version_scn=>15629546018831
);
wwv_flow_imp.component_end;
end;
/
