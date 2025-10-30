.class public final LG2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/EpisodeResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LH2/i;

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    iget-object v0, p1, Lcom/anilab/data/model/response/EpisodeResponse;->a:Ljava/lang/Long;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-wide v4, v2

    .line 22
    :goto_0
    iget-object v0, p1, Lcom/anilab/data/model/response/EpisodeResponse;->b:Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    iget-object v6, p1, Lcom/anilab/data/model/response/EpisodeResponse;->c:Ljava/lang/Integer;

    .line 32
    .line 33
    if-eqz v6, :cond_2

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v6, v0

    .line 41
    :goto_1
    iget-object v7, p1, Lcom/anilab/data/model/response/EpisodeResponse;->d:Ljava/lang/Integer;

    .line 42
    .line 43
    if-nez v7, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x1

    .line 51
    if-ne v7, v8, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    :goto_2
    move v8, v0

    .line 55
    :goto_3
    iget-object v7, p1, Lcom/anilab/data/model/response/EpisodeResponse;->e:Ljava/lang/String;

    .line 56
    .line 57
    move-wide v9, v4

    .line 58
    move-wide v4, v2

    .line 59
    move-wide v2, v9

    .line 60
    invoke-direct/range {v1 .. v8}, LH2/i;-><init>(JJILjava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    return-object v1
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
