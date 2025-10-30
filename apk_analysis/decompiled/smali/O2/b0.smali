.class public final LO2/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly2/a;


# direct methods
.method public constructor <init>(Ly2/a;)V
    .locals 1

    .line 1
    const-string v0, "encryptedPreference"

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
    iput-object p1, p0, LO2/b0;->a:Ly2/a;

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
.method public final a(LH2/u;)V
    .locals 12

    .line 1
    iget-object v0, p0, LO2/b0;->a:Ly2/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {v0, p1}, LO4/h;->J(Ly2/a;Lcom/anilab/data/model/preference/RecentlyWatchedJson;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Lcom/anilab/data/model/preference/RecentlyWatchedJson;

    .line 11
    .line 12
    iget-wide v2, p1, LH2/u;->a:J

    .line 13
    .line 14
    iget-wide v4, p1, LH2/u;->b:J

    .line 15
    .line 16
    iget-wide v6, p1, LH2/u;->c:J

    .line 17
    .line 18
    iget-object v8, p1, LH2/u;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v9, p1, LH2/u;->e:Ljava/lang/String;

    .line 21
    .line 22
    iget v10, p1, LH2/u;->g:I

    .line 23
    .line 24
    iget-object v11, p1, LH2/u;->h:Ljava/util/List;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v11}, Lcom/anilab/data/model/preference/RecentlyWatchedJson;-><init>(JJJLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, LO4/h;->J(Ly2/a;Lcom/anilab/data/model/preference/RecentlyWatchedJson;)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
