.class public final LG2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# instance fields
.field public final a:LG2/s;


# direct methods
.method public constructor <init>(LG2/s;)V
    .locals 1

    .line 1
    const-string v0, "movieMapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LG2/t;->a:LG2/s;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LH2/v;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->j:Lcom/anilab/data/model/response/MovieResponse;

    .line 11
    .line 12
    iget-object v2, p0, LG2/t;->a:LG2/s;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, LG2/s;->a(Lcom/anilab/data/model/response/MovieResponse;)Lcom/anilab/domain/model/Movie;

    .line 15
    .line 16
    .line 17
    move-result-object v12

    .line 18
    iget-object v8, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->f:Ljava/lang/Integer;

    .line 19
    .line 20
    iget-object v9, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->g:Ljava/lang/Long;

    .line 21
    .line 22
    iget-wide v2, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->a:J

    .line 23
    .line 24
    iget-object v4, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->b:Ljava/lang/Long;

    .line 25
    .line 26
    iget-object v5, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->c:Ljava/lang/Integer;

    .line 27
    .line 28
    iget-object v6, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v7, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v10, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->h:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v11, p1, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->i:Ljava/lang/Long;

    .line 35
    .line 36
    invoke-direct/range {v1 .. v12}, LH2/v;-><init>(JLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/anilab/domain/model/Movie;)V

    .line 37
    .line 38
    .line 39
    return-object v1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
