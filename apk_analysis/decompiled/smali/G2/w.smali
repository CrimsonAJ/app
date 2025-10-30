.class public final LG2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/UserResponse;)LH2/y;
    .locals 9

    .line 1
    const-string v0, "dto"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LH2/y;

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/anilab/data/model/response/UserResponse;->a:J

    .line 9
    .line 10
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    iget-object v4, p0, Lcom/anilab/data/model/response/UserResponse;->h:Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ne v4, v3, :cond_1

    .line 26
    .line 27
    move v6, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move v6, v0

    .line 30
    :goto_1
    iget-object v4, p0, Lcom/anilab/data/model/response/UserResponse;->g:Ljava/lang/Long;

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    :goto_2
    move-object v7, v4

    .line 35
    goto :goto_3

    .line 36
    :cond_2
    iget-object v4, p0, Lcom/anilab/data/model/response/UserResponse;->f:Lcom/anilab/data/model/response/AvatarResponse;

    .line 37
    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    iget-wide v4, v4, Lcom/anilab/data/model/response/AvatarResponse;->a:J

    .line 41
    .line 42
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const/4 v4, 0x0

    .line 48
    goto :goto_2

    .line 49
    :goto_3
    iget-object v4, p0, Lcom/anilab/data/model/response/UserResponse;->i:Ljava/lang/Integer;

    .line 50
    .line 51
    if-nez v4, :cond_4

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-ne v4, v3, :cond_5

    .line 59
    .line 60
    move v8, v3

    .line 61
    goto :goto_5

    .line 62
    :cond_5
    :goto_4
    move v8, v0

    .line 63
    :goto_5
    iget-object v3, p0, Lcom/anilab/data/model/response/UserResponse;->b:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/anilab/data/model/response/UserResponse;->c:Ljava/lang/String;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct/range {v1 .. v8}, LH2/y;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Z)V

    .line 69
    .line 70
    .line 71
    return-object v1
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


# virtual methods
.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/UserResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/w;->a(Lcom/anilab/data/model/response/UserResponse;)LH2/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
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
