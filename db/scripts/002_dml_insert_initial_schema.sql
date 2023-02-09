insert into files(name, path) values('чебурашка', 'files/cheburashka.png');
insert into files(name, path) values('непослушник2', 'files/neposlushnik2.png');
insert into files(name, path) values('аватар2', 'files/avatar2.png');

insert into genres(name) values('комедия');
insert into genres(name) values('фантастика');
insert into genres(name) values('детектив');

insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Чебурашка', 'Фильм про Чебурашку', 2022, 1, 0, 120, 1);
insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Непослушник-2', 'Продолжение про блоггера-послушника', 2022, 1, 0, 120, 2);
insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Аватар-2', 'Продолжение про аватара', 2022, 2, 18, 190, 3);

insert into halls(name, row_count, place_count, description) values(
 'Зал1', 20, 25, 'IMAX');
insert into halls(name, row_count, place_count, description) values(
 'Зал2', 10, 15, 'Обычный');
insert into halls(name, row_count, place_count, description) values(
 'Зал3', 10, 15, '3D');

insert into film_sessions(film_id, halls_id, start_time, end_time) values(1, 3, '10:00:00', '12:00:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(1, 3, '12:30:00', '14:30:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(1, 3, '16:00:00', '18:00:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(1, 3, '18:00:00', '20:00:00');

insert into film_sessions(film_id, halls_id, start_time, end_time) values(2, 2, '10:00:00', '12:00:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(2, 2, '12:30:00', '14:30:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(2, 2, '15:00:00', '17:00:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(2, 2, '19:00:00', '21:00:00');

insert into film_sessions(film_id, halls_id, start_time, end_time) values(3, 1, '11:00:00', '14:10:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(3, 1, '15:00:00', '18:10:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(3, 1, '19:00:00', '22:10:00');