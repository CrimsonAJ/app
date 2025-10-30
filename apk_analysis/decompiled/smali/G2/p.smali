.class public final LG2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/LatestVersionResponse;)Lcom/anilab/domain/model/LatestVersion;
    .locals 7

    .line 1
    new-instance v0, Lcom/anilab/domain/model/LatestVersion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lcom/anilab/data/model/response/LatestVersionResponse;->b:Ljava/lang/String;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v2, v1

    .line 10
    :goto_0
    const-string v3, ""

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    move-object v2, v3

    .line 15
    :cond_1
    const/4 v4, 0x0

    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    iget-object v5, p0, Lcom/anilab/data/model/response/LatestVersionResponse;->c:Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v5, :cond_2

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move v5, v4

    .line 28
    :goto_1
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-object v6, p0, Lcom/anilab/data/model/response/LatestVersionResponse;->d:Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move-object v6, v1

    .line 34
    :goto_2
    if-nez v6, :cond_4

    .line 35
    .line 36
    move-object v6, v3

    .line 37
    :cond_4
    if-eqz p0, :cond_5

    .line 38
    .line 39
    iget-object v1, p0, Lcom/anilab/data/model/response/LatestVersionResponse;->e:Ljava/lang/String;

    .line 40
    .line 41
    :cond_5
    if-nez v1, :cond_6

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_6
    move-object v3, v1

    .line 45
    :goto_3
    if-eqz p0, :cond_8

    .line 46
    .line 47
    iget-object p0, p0, Lcom/anilab/data/model/response/LatestVersionResponse;->f:Ljava/lang/Integer;

    .line 48
    .line 49
    if-nez p0, :cond_7

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 v1, 0x1

    .line 57
    if-ne p0, v1, :cond_8

    .line 58
    .line 59
    move v4, v5

    .line 60
    move v5, v1

    .line 61
    move-object v1, v2

    .line 62
    move v2, v4

    .line 63
    :goto_4
    move-object v4, v3

    .line 64
    move-object v3, v6

    .line 65
    goto :goto_6

    .line 66
    :cond_8
    :goto_5
    move-object v1, v2

    .line 67
    move v2, v5

    .line 68
    move v5, v4

    .line 69
    goto :goto_4

    .line 70
    :goto_6
    invoke-direct/range {v0 .. v5}, Lcom/anilab/domain/model/LatestVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    return-object v0
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
    check-cast p1, Lcom/anilab/data/model/response/LatestVersionResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/p;->a(Lcom/anilab/data/model/response/LatestVersionResponse;)Lcom/anilab/domain/model/LatestVersion;

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
