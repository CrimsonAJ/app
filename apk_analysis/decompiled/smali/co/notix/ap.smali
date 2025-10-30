.class public abstract Lco/notix/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/y8;


# direct methods
.method public constructor <init>(Lco/notix/d9;)V
    .locals 1

    const-string v0, "contextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/ap;->a:Lco/notix/y8;

    return-void
.end method

.method public static final a(Lco/notix/ap;Le1/r;)Le1/s;
    .locals 7

    .line 7
    new-instance p0, Le1/e;

    invoke-direct {p0}, Le1/e;-><init>()V

    .line 8
    new-instance v0, Le1/c;

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 10
    iput v1, v0, Le1/c;->a:I

    const-wide/16 v2, -0x1

    .line 11
    iput-wide v2, v0, Le1/c;->f:J

    .line 12
    iput-wide v2, v0, Le1/c;->g:J

    .line 13
    new-instance v4, Le1/e;

    invoke-direct {v4}, Le1/e;-><init>()V

    iput-object v4, v0, Le1/c;->h:Le1/e;

    const/4 v4, 0x0

    .line 14
    iput-boolean v4, v0, Le1/c;->b:Z

    .line 15
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    iput-boolean v4, v0, Le1/c;->c:Z

    const/4 v6, 0x2

    .line 16
    iput v6, v0, Le1/c;->a:I

    .line 17
    iput-boolean v4, v0, Le1/c;->d:Z

    .line 18
    iput-boolean v4, v0, Le1/c;->e:Z

    const/16 v6, 0x18

    if-lt v5, v6, :cond_0

    .line 19
    iput-object p0, v0, Le1/c;->h:Le1/e;

    .line 20
    iput-wide v2, v0, Le1/c;->f:J

    .line 21
    iput-wide v2, v0, Le1/c;->g:J

    .line 22
    :cond_0
    iget-object p0, p1, Le1/r;->c:Ln1/j;

    .line 23
    iput-object v0, p0, Ln1/j;->j:Le1/c;

    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    iput-boolean v1, p1, Le1/r;->a:Z

    .line 26
    iput v1, p0, Ln1/j;->l:I

    const-wide/16 v1, 0x1e

    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    const-wide/32 v2, 0x112a880

    cmp-long v5, v0, v2

    .line 28
    sget-object v6, Ln1/j;->s:Ljava/lang/String;

    if-lez v5, :cond_1

    .line 29
    invoke-static {}, Le1/q;->d()Le1/q;

    move-result-object v0

    const-string v1, "Backoff delay duration exceeds maximum value"

    new-array v5, v4, [Ljava/lang/Throwable;

    invoke-virtual {v0, v6, v1, v5}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    move-wide v0, v2

    :cond_1
    const-wide/16 v2, 0x2710

    cmp-long v5, v0, v2

    if-gez v5, :cond_2

    .line 30
    invoke-static {}, Le1/q;->d()Le1/q;

    move-result-object v0

    const-string v1, "Backoff delay duration less than minimum value"

    new-array v4, v4, [Ljava/lang/Throwable;

    invoke-virtual {v0, v6, v1, v4}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    move-wide v0, v2

    .line 31
    :cond_2
    iput-wide v0, p0, Ln1/j;->m:J

    .line 32
    invoke-virtual {p1}, Le1/r;->a()Le1/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lco/notix/to;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/to;

    iget v1, v0, Lco/notix/to;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/to;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/to;

    invoke-direct {v0, p0, p1}, Lco/notix/to;-><init>(Lco/notix/ap;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/to;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/to;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 1
    iget-object p1, p0, Lco/notix/ap;->a:Lco/notix/y8;

    check-cast p1, Lco/notix/d9;

    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lf1/k;->b0(Landroid/content/Context;)Lf1/k;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lco/notix/ap;->a()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v4, Lo1/b;

    invoke-direct {v4, p1, v2, v3}, Lo1/b;-><init>(Lf1/k;Ljava/lang/String;Z)V

    .line 5
    iget-object p1, p1, Lf1/k;->k:Lb5/G1;

    invoke-virtual {p1, v4}, Lb5/G1;->i(Ljava/lang/Runnable;)V

    .line 6
    iget-object p1, v4, Lo1/c;->a:LO0/c;

    const-string v2, "workManager.cancelUniqueWork(workName)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, LO0/c;->c:Ljava/lang/Object;

    check-cast p1, Lp1/j;

    const-string v2, "result"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lp1/h;->isDone()Z

    move-result v2

    if-eqz v2, :cond_4

    :try_start_0
    invoke-virtual {p1}, Lp1/h;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    throw p1

    :cond_4
    iput v3, v0, Lco/notix/to;->c:I

    new-instance v2, LY7/h;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D1;->A(LE7/d;)LE7/d;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LY7/h;-><init>(ILE7/d;)V

    invoke-virtual {v2}, LY7/h;->s()V

    new-instance v0, Lco/notix/ro;

    invoke-direct {v0, v2, p1}, Lco/notix/ro;-><init>(LY7/h;LS5/p;)V

    sget-object v3, Le1/i;->a:Le1/i;

    invoke-virtual {p1, v0, v3}, Lp1/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v0, Lco/notix/so;

    invoke-direct {v0, p1}, Lco/notix/so;-><init>(LS5/p;)V

    invoke-virtual {v2, v0}, LY7/h;->u(LO7/l;)V

    invoke-virtual {v2}, LY7/h;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    const-string v0, "result.await()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Ljava/lang/Class;
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lco/notix/zo;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/zo;

    iget v1, v0, Lco/notix/zo;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/zo;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/zo;

    invoke-direct {v0, p0, p1}, Lco/notix/zo;-><init>(Lco/notix/ap;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/zo;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/zo;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 1
    iget-object p1, p0, Lco/notix/ap;->a:Lco/notix/y8;

    check-cast p1, Lco/notix/d9;

    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lf1/k;->b0(Landroid/content/Context;)Lf1/k;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lco/notix/ap;->a()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v4, LA4/j;

    invoke-direct {v4, p1, v2}, LA4/j;-><init>(Lf1/k;Ljava/lang/String;)V

    .line 5
    iget-object p1, p1, Lf1/k;->k:Lb5/G1;

    .line 6
    iget-object p1, p1, Lb5/G1;->b:Ljava/lang/Object;

    check-cast p1, Lo1/i;

    .line 7
    invoke-virtual {p1, v4}, Lo1/i;->execute(Ljava/lang/Runnable;)V

    .line 8
    iget-object p1, v4, LA4/j;->b:Ljava/lang/Object;

    check-cast p1, Lp1/j;

    const-string v2, "workManager.getWorkInfosForUniqueWork(workName)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lp1/h;->isDone()Z

    move-result v2

    if-eqz v2, :cond_4

    :try_start_0
    invoke-virtual {p1}, Lp1/h;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    throw p1

    :cond_4
    iput v3, v0, Lco/notix/zo;->c:I

    new-instance v2, LY7/h;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D1;->A(LE7/d;)LE7/d;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LY7/h;-><init>(ILE7/d;)V

    invoke-virtual {v2}, LY7/h;->s()V

    new-instance v0, Lco/notix/xo;

    invoke-direct {v0, v2, p1}, Lco/notix/xo;-><init>(LY7/h;LS5/p;)V

    sget-object v4, Le1/i;->a:Le1/i;

    invoke-virtual {p1, v0, v4}, Lp1/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v0, Lco/notix/yo;

    invoke-direct {v0, p1}, Lco/notix/yo;-><init>(LS5/p;)V

    invoke-virtual {v2, v0}, LY7/h;->u(LO7/l;)V

    invoke-virtual {v2}, LY7/h;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_8

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/x;

    .line 9
    iget v0, v0, Le1/x;->b:I

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/k1;->c(I)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v3, 0x0

    .line 11
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
