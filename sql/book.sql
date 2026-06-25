-- Active: 1779695880620@@127.0.0.1@3306@ruoyi
-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制', '3', '1', 'control', 'system/control/index', 1, 0, 'C', '0', '0', 'system:control:list', '#', 'admin', sysdate(), '', null, '书籍控制菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:control:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:control:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:control:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:control:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('书籍控制导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:control:export',       '#', 'admin', sysdate(), '', null, '');