prompt --application/pages/page_groups
begin
--   Manifest
--     PAGE GROUPS: 200942
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_page.create_page_group(
 p_id=>wwv_flow_imp.id(52608370793797296099)
,p_group_name=>'Administration'
);
wwv_flow_imp_page.create_page_group(
 p_id=>wwv_flow_imp.id(52608684129325297175)
,p_group_name=>'User Settings'
);
wwv_flow_imp.component_end;
end;
/
