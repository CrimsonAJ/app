.class public abstract Lco/notix/worker/SelfRestartingWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method

.method public static a(Lco/notix/worker/SelfRestartingWorker;LE7/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lco/notix/bp;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/bp;

    iget v1, v0, Lco/notix/bp;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/bp;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/bp;

    invoke-direct {v0, p0, p1}, Lco/notix/bp;-><init>(Lco/notix/worker/SelfRestartingWorker;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/bp;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/bp;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lco/notix/bp;->a:Lco/notix/worker/SelfRestartingWorker;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lco/notix/bp;->a:Lco/notix/worker/SelfRestartingWorker;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iput-object p0, v0, Lco/notix/bp;->a:Lco/notix/worker/SelfRestartingWorker;

    iput v5, v0, Lco/notix/bp;->d:I

    invoke-virtual {p0, v0}, Lco/notix/worker/SelfRestartingWorker;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p1, Lco/notix/pr;

    instance-of v2, p1, Lco/notix/nr;

    if-eqz v2, :cond_8

    iput-object p0, v0, Lco/notix/bp;->a:Lco/notix/worker/SelfRestartingWorker;

    iput v4, v0, Lco/notix/bp;->d:I

    invoke-virtual {p0, v0}, Lco/notix/worker/SelfRestartingWorker;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lco/notix/worker/SelfRestartingWorker;->a()Lco/notix/ap;

    move-result-object p0

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/bp;->a:Lco/notix/worker/SelfRestartingWorker;

    iput v3, v0, Lco/notix/bp;->d:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    sget-object v2, LY7/u0;->a:LY7/u0;

    new-instance v3, Lco/notix/wo;

    invoke-direct {v3, p0, v4, v5, p1}, Lco/notix/wo;-><init>(Lco/notix/ap;JLE7/d;)V

    invoke-static {v2, v3, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_7

    goto :goto_3

    :cond_7
    sget-object p0, LA7/n;->a:LA7/n;

    :goto_3
    if-ne p0, v1, :cond_a

    :goto_4
    return-object v1

    .line 2
    :cond_8
    instance-of p0, p1, Lco/notix/mr;

    if-eqz p0, :cond_9

    .line 3
    new-instance p0, Le1/n;

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0

    .line 5
    :cond_9
    instance-of p0, p1, Lco/notix/or;

    if-eqz p0, :cond_b

    .line 6
    :cond_a
    :goto_5
    new-instance p0, Le1/o;

    .line 7
    sget-object p1, Le1/h;->c:Le1/h;

    invoke-direct {p0, p1}, Le1/o;-><init>(Le1/h;)V

    return-object p0

    .line 8
    :cond_b
    new-instance p0, LA7/b;

    .line 9
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 10
    throw p0
.end method


# virtual methods
.method public abstract a()Lco/notix/ap;
.end method

.method public abstract a(LE7/d;)Ljava/lang/Object;
.end method

.method public abstract b(LE7/d;)Ljava/lang/Object;
.end method

.method public final doWork(LE7/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/notix/worker/SelfRestartingWorker;->a(Lco/notix/worker/SelfRestartingWorker;LE7/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
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
