.class public final LL1/S;
.super LM1/r;
.source "SourceFile"


# instance fields
.field public A:LH2/s;

.field public B:LH2/t;

.field public final f:LP2/e;

.field public final g:LP2/k;

.field public final h:LL2/d;

.field public final i:LL2/G;

.field public final j:Landroid/app/Application;

.field public final k:LP2/g;

.field public final l:LO2/b0;

.field public final m:LL2/v;

.field public final n:Lb8/Q;

.field public final o:Lb8/Q;

.field public final p:Lb8/Q;

.field public final q:Lb8/Q;

.field public final r:Lb8/Q;

.field public final s:Lb8/H;

.field public final t:Lb8/Q;

.field public final u:Lb8/Q;

.field public final v:Lb8/Q;

.field public final w:Ljava/lang/String;

.field public x:LH2/o;

.field public y:I

.field public z:LY7/y0;


# direct methods
.method public constructor <init>(LP2/e;LP2/k;LL2/d;LL2/G;Landroid/app/Application;LP2/g;LO2/b0;LL2/v;LA1/g;LL2/H;LM2/b;LL2/t;LL2/f;LL2/h;LL2/r;LL2/a;LL2/x;LL2/F;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p17

    const-string v9, "checkLoginUserCase"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getUserInfoUseCase"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "deviceSyncUseCase"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "uuidUseCase"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "continueWatchUseCase"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "saveWatchedUseCase"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "lastLoopUseCase"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "versionNameUseCase"

    move-object/from16 v10, p10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getGenresUseCase"

    move-object/from16 v11, p11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "latestVersionUseCase"

    move-object/from16 v12, p12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getAllSettingsUseCase"

    move-object/from16 v13, p13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getAvatarsUseCase"

    move-object/from16 v14, p14

    invoke-static {v14, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "ipInfoUseCase"

    move-object/from16 v15, p15

    invoke-static {v15, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "cfgUseCase"

    move-object/from16 v10, p16

    invoke-static {v10, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "netCacheUseCase"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "reachableUseCase"

    move-object/from16 v10, p18

    invoke-static {v10, v9}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v1}, LM1/r;-><init>()V

    .line 2
    iput-object v0, v1, LL1/S;->f:LP2/e;

    .line 3
    iput-object v2, v1, LL1/S;->g:LP2/k;

    .line 4
    iput-object v3, v1, LL1/S;->h:LL2/d;

    .line 5
    iput-object v4, v1, LL1/S;->i:LL2/G;

    move-object/from16 v0, p5

    .line 6
    iput-object v0, v1, LL1/S;->j:Landroid/app/Application;

    .line 7
    iput-object v5, v1, LL1/S;->k:LP2/g;

    .line 8
    iput-object v6, v1, LL1/S;->l:LO2/b0;

    .line 9
    iput-object v7, v1, LL1/S;->m:LL2/v;

    .line 10
    new-instance v0, LM1/t;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->n:Lb8/Q;

    .line 11
    new-instance v0, LM1/t;

    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->o:Lb8/Q;

    .line 12
    new-instance v0, LM1/t;

    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->p:Lb8/Q;

    .line 13
    new-instance v0, LM1/t;

    sget-object v3, Lb2/o;->a:Lb2/o;

    invoke-direct {v0, v3}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->q:Lb8/Q;

    .line 14
    new-instance v0, LM1/t;

    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->r:Lb8/Q;

    .line 15
    new-instance v3, Lb8/H;

    invoke-direct {v3, v0}, Lb8/H;-><init>(Lb8/F;)V

    .line 16
    iput-object v3, v1, LL1/S;->s:Lb8/H;

    .line 17
    new-instance v0, LM1/t;

    sget-object v3, LL1/F;->b:LL1/F;

    invoke-direct {v0, v3}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->t:Lb8/Q;

    .line 18
    new-instance v0, LM1/t;

    sget-object v3, LL1/B;->a:LL1/B;

    invoke-direct {v0, v3}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->u:Lb8/Q;

    .line 19
    new-instance v0, LM1/t;

    invoke-direct {v0, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object v0

    iput-object v0, v1, LL1/S;->v:Lb8/Q;

    const/4 v0, 0x0

    .line 20
    invoke-virtual {v8, v0}, LL2/x;->a(Landroid/app/Application;)Ljava/lang/String;

    move-result-object v2

    .line 21
    iput-object v2, v1, LL1/S;->w:Ljava/lang/String;

    const/4 v2, -0x1

    .line 22
    iput v2, v1, LL1/S;->y:I

    move-object v2, v0

    .line 23
    new-instance v0, LL1/y;

    const/4 v11, 0x0

    move-object/from16 v8, p9

    move-object/from16 v5, p10

    move-object/from16 v9, p11

    move-object/from16 v3, p16

    move-object v6, v12

    move-object v7, v13

    move-object v4, v15

    move-object v12, v2

    move-object v2, v10

    move-object v10, v14

    invoke-direct/range {v0 .. v11}, LL1/y;-><init>(LL1/S;LL2/F;LL2/a;LL2/r;LL2/H;LL2/t;LL2/f;LA1/g;LM2/b;LL2/h;LE7/d;)V

    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v2, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 25
    new-instance v0, LL1/z;

    invoke-direct {v0, v1, v12}, LL1/z;-><init>(LL1/S;LE7/d;)V

    .line 26
    invoke-virtual {v1, v2, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 27
    new-instance v0, LL1/A;

    invoke-direct {v0, v1, v12}, LL1/A;-><init>(LL1/S;LE7/d;)V

    .line 28
    invoke-virtual {v1, v2, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    return-void
.end method


# virtual methods
.method public final g(LH2/u;)V
    .locals 4

    .line 1
    iget-wide v0, p1, LH2/u;->a:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p1, LH2/u;->b:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, LL1/J;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, p1, v1}, LL1/J;-><init>(LL1/S;LH2/u;LE7/d;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p0, v2, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 24
    .line 25
    .line 26
    new-instance v0, LL1/K;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, v1}, LL1/K;-><init>(LL1/S;LH2/u;LE7/d;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final h(I)V
    .locals 4

    .line 1
    iget v0, p0, LL1/S;->y:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, LL1/S;->y:I

    .line 7
    .line 8
    iget-object v0, p0, LL1/S;->z:LY7/y0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LY7/r0;->d(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/Y;->g(LM1/r;)LY7/z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v2, LY7/K;->b:Lf8/d;

    .line 21
    .line 22
    new-instance v3, LL1/Q;

    .line 23
    .line 24
    invoke-direct {v3, p0, p1, v1}, LL1/Q;-><init>(LL1/S;ILE7/d;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    invoke-static {v0, v2, v3, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, LL1/S;->z:LY7/y0;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
.end method
