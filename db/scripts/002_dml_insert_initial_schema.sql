--ALTER SEQUENCE files_id_seq RESTART WITH 1;
--ALTER SEQUENCE genres_id_seq RESTART WITH 1;
--ALTER SEQUENCE halls_id_seq RESTART WITH 1;
--ALTER SEQUENCE films_id_seq RESTART WITH 1;
--ALTER SEQUENCE film_sessions_id_seq RESTART WITH 1;
--delete from files;
--delete from genres;
--delete from halls;
--delete from films;
--delete from film_sessions;

insert into files(name, path) values('чебурашка', 'files/cheburashka.png');
insert into files(name, path) values('непослушник2', 'files/neposlushnik2.png');
insert into files(name, path) values('аватар2', 'files/avatar2.png');

insert into genres(name) values('комедия');
insert into genres(name) values('фантастика');
insert into genres(name) values('детектив');

insert into halls(name, row_count, place_count, description) values(
 'Зал1', 20, 25, 'IMAX');
insert into halls(name, row_count, place_count, description) values(
 'Зал2', 10, 15, 'Обычный');
insert into halls(name, row_count, place_count, description) values(
 'Зал3', 10, 15, '3D');

insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Чебурашка', 'Фильм про Чебурашку', 2022, 1, 0, 120, 1);
insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Непослушник-2', 'Продолжение про блоггера-послушника', 2022, 1, 0, 120, 2);
insert into films(name, description, year, genre_id, minimal_age, duration_in_minutes, file_id) values(
 'Аватар-2', 'Продолжение про аватара', 2022, 2, 18, 190, 3);

insert into film_sessions(film_id, halls_id, start_time, end_time) values(
1, 3, CURRENT_DATE + TIME '10:00', CURRENT_DATE + TIME '12:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
1, 3, CURRENT_DATE + TIME '12:30', CURRENT_DATE + TIME '14:30');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
1, 3, CURRENT_DATE + TIME '16:00', CURRENT_DATE + TIME '18:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
1, 3, CURRENT_DATE + TIME '18:00', CURRENT_DATE + TIME '20:00');

insert into film_sessions(film_id, halls_id, start_time, end_time) values(
2, 2, CURRENT_DATE + TIME '10:00', CURRENT_DATE + TIME '12:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
2, 2, CURRENT_DATE + TIME '12:30', CURRENT_DATE + TIME '14:30');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
2, 2, CURRENT_DATE + TIME '15:00', CURRENT_DATE + TIME '17:00');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
2, 2, CURRENT_DATE + TIME '19:00', CURRENT_DATE + TIME '21:00');

insert into film_sessions(film_id, halls_id, start_time, end_time) values(
3, 1, CURRENT_DATE + TIME '11:00', CURRENT_DATE + TIME '14:10');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
3, 1, CURRENT_DATE + TIME '15:00', CURRENT_DATE + TIME '18:10');
insert into film_sessions(film_id, halls_id, start_time, end_time) values(
3, 1, CURRENT_DATE + TIME '19:00', CURRENT_DATE + TIME '22:10');
