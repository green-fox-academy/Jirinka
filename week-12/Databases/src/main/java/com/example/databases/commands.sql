USE movies;
select title FROM movie WHERE director LIKE 'Steven Spielberg';

SELECT DISTINCT year
FROM movie
    INNER JOIN rating
        ON movie.mID = rating.mID
WHERE stars > 3 ORDER BY year;


