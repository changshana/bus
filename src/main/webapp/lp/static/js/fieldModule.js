var keys=['field_name','field_alias','field_type','field_iskey','field_isnullable','field_auto_increment','field_unique','db_auto_increment',
          'field_max_length','field_decimal_length','field_min_length','field_min','field_max','default_value','input_type'];
var field_module= {
    'id': {
        'module_msg': {
            'field_name': '_id',
            'field_alias': 'ID',
            'field_type': 'int',
            'field_iskey': '1',
            'field_isnullable': '',
            'field_auto_increment': '1',
            'field_unique': '1',
            'db_auto_increment': '',
            'field_max_length': '11',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '-2147483647',
            'field_max': '2147483647',
            'default_value': '0',
            'input_type': 'hidden'
        }
    },
    'lid': {
        'module_msg': {
            'field_name': '_id',
            'field_alias': 'LID',
            'field_type': 'bigint',
            'field_iskey': '1',
            'field_isnullable': '',
            'field_auto_increment': '1',
            'field_unique': '1',
            'db_auto_increment': '',
            'field_max_length': '20',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '0',
            'input_type': 'hidden'
        }
    },
    'name': {
        'module_msg': {
            'field_name': '_name',
            'field_alias': '名称',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '50',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'text'
        }
    },
    'code': {
        'module_msg': {
            'field_name': '_code',
            'field_alias': '代码',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '50',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'text'
        }
    },
    'title': {
        'module_msg': {
            'field_name': 'title',
            'field_alias': '标题',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '200',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'text'
        }
    },
    'content': {
        'module_msg': {
            'field_name': 'content',
            'field_alias': '内容',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '8000',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'textarea'
        }
    },
    'status': {
        'module_msg': {
            'field_name': 'status',
            'field_alias': '状态',
            'field_type': 'int',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '1',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'checkbox'
        }
    },
    'remark': {
        'module_msg': {
            'field_name': 'remark',
            'field_alias': '备注',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '200',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'textarea'
        }
    },
    'order_code': {
        'module_msg': {
            'field_name': 'order_code',
            'field_alias': '排序',
            'field_type': 'int',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '4',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'text'
        }
    },
    'birthday': {
        'module_msg': {
            'field_name': 'birthday',
            'field_alias': '生日',
            'field_type': 'date',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '0',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'date'
        }
    },
    'the_time': {
        'module_msg': {
            'field_name': 'the_time',
            'field_alias': '时间',
            'field_type': 'date',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '0',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': ''
        }
    },
    'create_time': {
        'module_msg': {
            'field_name': 'create_time',
            'field_alias': '创建时间',
            'field_type': 'datetime',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '0',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'hidden'
        }
    },
    'creator': {
        'module_msg': {
            'field_name': 'creator',
            'field_alias': '创建用户',
            'field_type': 'varchar',
            'field_iskey': '',
            'field_isnullable': '1',
            'field_auto_increment': '',
            'field_unique': '',
            'db_auto_increment': '',
            'field_max_length': '50',
            'field_decimal_length': '0',
            'field_min_length': '0',
            'field_min': '',
            'field_max': '',
            'default_value': '',
            'input_type': 'hidden'
        }
    }
};