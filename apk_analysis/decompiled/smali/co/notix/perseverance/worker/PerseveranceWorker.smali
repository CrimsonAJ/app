.class public final Lco/notix/perseverance/worker/PerseveranceWorker;
.super Lco/notix/worker/SelfRestartingWorker;
.source "SourceFile"


# static fields
.field public static final d:Lg8/a;


# instance fields
.field public final a:LY7/z;

.field public final b:Lco/notix/ej;

.field public final c:Lco/notix/fj;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lg8/e;->a()Lg8/d;

    move-result-object v0

    sput-object v0, Lco/notix/perseverance/worker/PerseveranceWorker;->d:Lg8/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/notix/worker/SelfRestartingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object p1

    invoke-virtual {p1}, Lco/notix/g9;->b()LY7/z;

    move-result-object p1

    iput-object p1, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->a:LY7/z;

    invoke-static {}, Lco/notix/wq;->y()Lco/notix/ej;

    move-result-object p1

    iput-object p1, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    invoke-static {}, Lco/notix/wq;->z()Lco/notix/fj;

    move-result-object p1

    iput-object p1, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->c:Lco/notix/fj;

    return-void
.end method

.method public static final a(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)Ljava/lang/Object;
    .locals 11

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    instance-of v0, p1, Lco/notix/hj;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/hj;

    iget v1, v0, Lco/notix/hj;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/hj;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/hj;

    invoke-direct {v0, p0, p1}, Lco/notix/hj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/hj;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/hj;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object v5

    :pswitch_1
    iget-object p0, v0, Lco/notix/hj;->b:Lco/notix/ni;

    iget-object v2, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :pswitch_3
    iget-object p0, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "perseverance: processOneCommand begin "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lco/notix/kd;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    iput-object p0, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput v4, v0, Lco/notix/hj;->e:I

    invoke-virtual {p1, v0}, Lco/notix/ej;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_1
    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    sget-object p1, LB7/t;->a:LB7/t;

    :cond_2
    sget-object v2, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "perseverance: queue size = "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lco/notix/kd;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lco/notix/ni;

    .line 3
    iget-wide v6, v6, Lco/notix/ni;->d:J

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_4
    move-object v2, v5

    .line 5
    :goto_2
    move-object p1, v2

    check-cast p1, Lco/notix/ni;

    if-nez p1, :cond_5

    .line 6
    sget-object p0, Lco/notix/nr;->a:Lco/notix/nr;

    return-object p0

    :cond_5
    sget-object v2, Lco/notix/s8;->b:LA7/e;

    .line 7
    iget-object v2, p1, Lco/notix/ni;->b:Ljava/lang/String;

    .line 8
    const-string v6, "name"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    sget-object v6, Lco/notix/s8;->b:LA7/e;

    .line 10
    invoke-interface {v6}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 11
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lco/notix/s8;

    .line 12
    iget-object v8, v8, Lco/notix/s8;->a:Ljava/lang/String;

    .line 13
    invoke-static {v8, v2}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_3

    :cond_7
    move-object v7, v5

    :goto_3
    check-cast v7, Lco/notix/s8;

    if-nez v7, :cond_9

    .line 14
    iget-object p1, p1, Lco/notix/ni;->a:Ljava/lang/String;

    .line 15
    iput-object v5, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput v3, v0, Lco/notix/hj;->e:I

    invoke-virtual {p0, p1, v0}, Lco/notix/perseverance/worker/PerseveranceWorker;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    goto/16 :goto_5

    :cond_8
    return-object p0

    .line 16
    :cond_9
    iget-object v2, p1, Lco/notix/ni;->e:Lorg/json/JSONObject;

    .line 17
    iput-object p0, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object p1, v0, Lco/notix/hj;->b:Lco/notix/ni;

    const/4 v6, 0x3

    iput v6, v0, Lco/notix/hj;->e:I

    invoke-static {v7, v2, v0}, Lco/notix/nj;->a(Lco/notix/s8;Lorg/json/JSONObject;LE7/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    goto/16 :goto_5

    :cond_a
    move-object v10, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v10

    :goto_4
    check-cast p1, Lco/notix/v8;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_e

    if-eq p1, v4, :cond_c

    if-eq p1, v3, :cond_b

    goto/16 :goto_6

    :cond_b
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "perseverance: command finished with result FAILURE. deleting it. workerParams = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lco/notix/ld;->a(Lco/notix/kd;Ljava/lang/String;)V

    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    .line 18
    iget-object p0, p0, Lco/notix/ni;->a:Ljava/lang/String;

    .line 19
    iput-object v5, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object v5, v0, Lco/notix/hj;->b:Lco/notix/ni;

    const/4 v2, 0x7

    iput v2, v0, Lco/notix/hj;->e:I

    invoke-virtual {p1, p0, v0}, Lco/notix/ej;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_f

    goto/16 :goto_5

    .line 20
    :cond_c
    iget p1, p0, Lco/notix/ni;->c:I

    const/16 v3, 0xe

    if-lt p1, v3, :cond_d

    .line 21
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "perseverance: command finished with result RETRY. deleting it because it used too many retries "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lco/notix/kd;->a(Ljava/lang/String;)V

    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    .line 22
    iget-object p0, p0, Lco/notix/ni;->a:Ljava/lang/String;

    .line 23
    iput-object v5, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object v5, v0, Lco/notix/hj;->b:Lco/notix/ni;

    const/4 v2, 0x5

    iput v2, v0, Lco/notix/hj;->e:I

    invoke-virtual {p1, p0, v0}, Lco/notix/ej;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_f

    goto :goto_5

    :cond_d
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "perseverance: command finished with result RETRY. workerParams = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lco/notix/kd;->b(Ljava/lang/String;)V

    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    .line 24
    iget-object p0, p0, Lco/notix/ni;->a:Ljava/lang/String;

    .line 25
    new-instance v3, Lco/notix/ij;

    invoke-direct {v3, v2}, Lco/notix/ij;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;)V

    iput-object v5, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object v5, v0, Lco/notix/hj;->b:Lco/notix/ni;

    const/4 v2, 0x6

    iput v2, v0, Lco/notix/hj;->e:I

    invoke-virtual {p1, p0, v3, v0}, Lco/notix/ej;->a(Ljava/lang/String;Lco/notix/ij;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_f

    goto :goto_5

    :cond_e
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "perseverance: command finished with result SUCCESS "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lco/notix/kd;->b(Ljava/lang/String;)V

    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    .line 26
    iget-object p0, p0, Lco/notix/ni;->a:Ljava/lang/String;

    .line 27
    iput-object v5, v0, Lco/notix/hj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object v5, v0, Lco/notix/hj;->b:Lco/notix/ni;

    const/4 v2, 0x4

    iput v2, v0, Lco/notix/hj;->e:I

    invoke-virtual {p1, p0, v0}, Lco/notix/ej;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_f

    :goto_5
    return-object v1

    :cond_f
    :goto_6
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Lco/notix/ap;
    .locals 1

    .line 34
    iget-object v0, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->c:Lco/notix/fj;

    return-object v0
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lco/notix/gj;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/gj;

    iget v1, v0, Lco/notix/gj;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/gj;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/gj;

    invoke-direct {v0, p0, p1}, Lco/notix/gj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/gj;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/gj;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lco/notix/gj;->a:Ljava/lang/String;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    const-string v2, "perseverance: finished queue processing."

    iput-object v2, v0, Lco/notix/gj;->a:Ljava/lang/String;

    iput v3, v0, Lco/notix/gj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/ej;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, v2

    :goto_1
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_9

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/notix/ni;

    .line 28
    iget-wide v2, v2, Lco/notix/ni;->d:J

    .line 29
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/notix/ni;

    .line 30
    iget-wide v4, v4, Lco/notix/ni;->d:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_5

    move-wide v2, v4

    goto :goto_2

    .line 31
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_7

    move-wide v2, v4

    :cond_7
    const/16 v1, 0x1388

    int-to-long v4, v1

    add-long/2addr v2, v4

    sget-object v1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " uncompleted commands. enqueueIn="

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lco/notix/kd;->b(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    .line 32
    :cond_9
    :goto_3
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " queue is empty"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lco/notix/kd;->b(Ljava/lang/String;)V

    const-wide/16 v2, -0x1

    .line 33
    :goto_4
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    return-object p1
.end method

.method public final a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 35
    instance-of v0, p2, Lco/notix/jj;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/jj;

    iget v1, v0, Lco/notix/jj;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/jj;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/jj;

    invoke-direct {v0, p0, p2}, Lco/notix/jj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/jj;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/jj;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    sget-object p2, Lco/notix/md;->a:Lco/notix/kd;

    const-string v2, "perseverance: Unknown command type"

    invoke-static {p2, v2}, Lco/notix/ld;->a(Lco/notix/kd;Ljava/lang/String;)V

    iget-object p2, p0, Lco/notix/perseverance/worker/PerseveranceWorker;->b:Lco/notix/ej;

    iput v3, v0, Lco/notix/jj;->c:I

    invoke-virtual {p2, p1, v0}, Lco/notix/ej;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lco/notix/kj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/kj;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/kj;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/kj;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/kj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/kj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/kj;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/kj;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object v2, v0, Lco/notix/kj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 55
    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v5, "perseverance: begin. runAttemptCount == "

    .line 59
    .line 60
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getRunAttemptCount()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v5, ", "

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {p1, v2}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v2, p0

    .line 86
    move-object p1, v3

    .line 87
    :goto_1
    if-nez p1, :cond_4

    .line 88
    .line 89
    iget-object p1, v2, Lco/notix/perseverance/worker/PerseveranceWorker;->a:LY7/z;

    .line 90
    .line 91
    invoke-interface {p1}, LY7/z;->g()LE7/i;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v5, Lco/notix/lj;

    .line 96
    .line 97
    invoke-direct {v5, v2, v3}, Lco/notix/lj;-><init>(Lco/notix/perseverance/worker/PerseveranceWorker;LE7/d;)V

    .line 98
    .line 99
    .line 100
    iput-object v2, v0, Lco/notix/kj;->a:Lco/notix/perseverance/worker/PerseveranceWorker;

    .line 101
    .line 102
    iput v4, v0, Lco/notix/kj;->d:I

    .line 103
    .line 104
    invoke-static {p1, v5, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v1, :cond_3

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_3
    :goto_2
    check-cast p1, Lco/notix/pr;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    return-object p1
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
