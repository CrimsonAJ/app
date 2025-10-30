.class public final LG2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/LoginResponse;)LH2/y;
    .locals 11

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
    iget-object v0, p0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 9
    .line 10
    iget-wide v2, v0, Lcom/anilab/data/model/response/UserResponse;->a:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v0, p0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 17
    .line 18
    iget-object v3, v0, Lcom/anilab/data/model/response/UserResponse;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, v0, Lcom/anilab/data/model/response/UserResponse;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/anilab/data/model/response/UserResponse;->f:Lcom/anilab/data/model/response/AvatarResponse;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lcom/anilab/data/model/response/AvatarResponse;->b:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v5

    .line 31
    :goto_0
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    :cond_1
    const-string v6, "{width}x{height}"

    .line 36
    .line 37
    const-string v7, "150x150"

    .line 38
    .line 39
    invoke-static {v0, v6, v7}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v6, p0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 44
    .line 45
    iget-object v6, v6, Lcom/anilab/data/model/response/UserResponse;->h:Ljava/lang/Integer;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x1

    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    move v6, v8

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_1
    move v6, v7

    .line 61
    :goto_2
    iget-object v9, p0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 62
    .line 63
    iget-object v9, v9, Lcom/anilab/data/model/response/UserResponse;->f:Lcom/anilab/data/model/response/AvatarResponse;

    .line 64
    .line 65
    if-eqz v9, :cond_4

    .line 66
    .line 67
    iget-wide v9, v9, Lcom/anilab/data/model/response/AvatarResponse;->a:J

    .line 68
    .line 69
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :cond_4
    iget-object p0, p0, Lcom/anilab/data/model/response/LoginResponse;->a:Lcom/anilab/data/model/response/UserResponse;

    .line 74
    .line 75
    iget-object p0, p0, Lcom/anilab/data/model/response/UserResponse;->i:Ljava/lang/Integer;

    .line 76
    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-ne p0, v8, :cond_6

    .line 85
    .line 86
    :goto_3
    move-object v7, v5

    .line 87
    move-object v5, v0

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    :goto_4
    move v8, v7

    .line 90
    goto :goto_3

    .line 91
    :goto_5
    invoke-direct/range {v1 .. v8}, LH2/y;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Z)V

    .line 92
    .line 93
    .line 94
    return-object v1
    .line 95
    .line 96
.end method


# virtual methods
.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/LoginResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/x;->a(Lcom/anilab/data/model/response/LoginResponse;)LH2/y;

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
