use todot;

set FOREIGN_KEY_CHECKS = 0;
truncate table todos;
set FOREIGN_KEY_CHECKS = 1;
insert into todos (text) value
  ('this is one todo'),
  ('this is Rafs todo'),
  ('this is kennys todo');