prompt --application/shared_components/user_interface/lovs/user_theme_preference
begin
--   Manifest
--     USER_THEME_PREFERENCE
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
 p_id=>wwv_flow_imp.id(52608501986887296964)
,p_lov_name=>'USER_THEME_PREFERENCE'
,p_lov_query=>'.'||wwv_flow_imp.id(52608501986887296964)||'.'
,p_location=>'STATIC'
,p_version_scn=>15629546034256
);
wwv_flow_imp_shared.create_static_lov_data(
 p_id=>wwv_flow_imp.id(52608502242238296964)
,p_lov_disp_sequence=>1
,p_lov_disp_value=>'Allow End Users to choose Theme Style'
,p_lov_return_value=>'Yes'
);
wwv_flow_imp.component_end;
end;
/
