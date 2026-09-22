# Write your MySQL query statement below
select s.score, count(t.score) as 'rank' from scores s,
(select distinct score from scores) t
where s.score<=t.score
group by s.id
order by s.score desc; 