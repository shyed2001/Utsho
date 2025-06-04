prompt --application/shared_components/user_interface/lovs/email_username_format
begin
--   Manifest
--     EMAIL_USERNAME_FORMAT
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_list_of_values(
 p_id=>wwv_flow_imp.id(52608609647173297093)
,p_lov_name=>'EMAIL_USERNAME_FORMAT'
,p_lov_query=>'.'||wwv_flow_imp.id(52608609647173297093)||'.'
,p_location=>'STATIC'
,p_version_scn=>15629546036442
);
wwv_flow_imp_shared.create_static_lov_data(
 p_id=>wwv_flow_imp.id(52608609962068297093)
,p_lov_disp_sequence=>1
,p_lov_disp_value=>'Email Addresses'
,p_lov_return_value=>'EMAIL'
);
wwv_flow_imp.component_end;
end;
/
