.class public final LG2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/DownloaderResponse;)LH2/h;
    .locals 4

    .line 1
    const-string v0, "dto"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LH2/h;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/anilab/data/model/response/DownloaderResponse;->a:Ljava/lang/Integer;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 22
    :goto_1
    const-string v1, ""

    .line 23
    .line 24
    iget-object v3, p0, Lcom/anilab/data/model/response/DownloaderResponse;->b:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object v3, v1

    .line 29
    :cond_2
    iget-object p0, p0, Lcom/anilab/data/model/response/DownloaderResponse;->c:Ljava/lang/String;

    .line 30
    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move-object v1, p0

    .line 35
    :goto_2
    invoke-direct {v0, v3, v1, v2}, LH2/h;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method


# virtual methods
.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/DownloaderResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/i;->a(Lcom/anilab/data/model/response/DownloaderResponse;)LH2/h;

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
