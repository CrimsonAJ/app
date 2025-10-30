.class public final Lco/notix/k8;
.super Lco/notix/t8;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/ma;


# direct methods
.method public constructor <init>(Lco/notix/ma;)V
    .locals 1

    const-string v0, "eventRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/notix/t8;-><init>()V

    iput-object p1, p0, Lco/notix/k8;->a:Lco/notix/ma;

    return-void
.end method


# virtual methods
.method public final a(Lco/notix/l8;LE7/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lco/notix/j8;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/j8;

    iget v1, v0, Lco/notix/j8;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/j8;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/j8;

    invoke-direct {v0, p0, p2}, Lco/notix/j8;-><init>(Lco/notix/k8;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/j8;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/j8;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/k8;->a:Lco/notix/ma;

    .line 1
    new-instance v2, Lorg/json/JSONObject;

    .line 2
    iget-object v4, p1, Lco/notix/l8;->a:Ljava/lang/String;

    .line 3
    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "event"

    const-string v5, "close"

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    iget-object v4, p1, Lco/notix/l8;->c:Lco/notix/p8;

    .line 5
    const-string v5, "reason"

    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    iget-object v4, p1, Lco/notix/l8;->b:Lco/notix/d3;

    .line 7
    sget-object v5, Lco/notix/c3;->a:Lco/notix/c3;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    sget-object v5, Lco/notix/y2;->a:Lco/notix/y2;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v4, 0x3

    goto :goto_1

    :cond_4
    sget-object v5, Lco/notix/b3;->a:Lco/notix/b3;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v4, 0x4

    goto :goto_1

    :cond_5
    sget-object v5, Lco/notix/w2;->a:Lco/notix/w2;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v4, 0x5

    goto :goto_1

    :cond_6
    sget-object v5, Lco/notix/v2;->a:Lco/notix/v2;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v4, 0x6

    goto :goto_1

    :cond_7
    sget-object v5, Lco/notix/z2;->a:Lco/notix/z2;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x7

    goto :goto_1

    :cond_8
    const/4 v4, 0x0

    .line 8
    :goto_1
    const-string v5, "ad_format"

    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "JSONObject(params.data).\u2026d())\n        }.toString()"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object p1, p1, Lco/notix/l8;->b:Lco/notix/d3;

    .line 10
    iput v3, v0, Lco/notix/j8;->c:I

    .line 11
    iget-object v4, p2, Lco/notix/ma;->c:LY7/z;

    .line 12
    invoke-interface {v4}, LY7/z;->g()LE7/i;

    move-result-object v4

    new-instance v5, Lco/notix/ka;

    const/4 v6, 0x0

    invoke-direct {v5, p2, v2, p1, v6}, Lco/notix/ka;-><init>(Lco/notix/ma;Ljava/lang/String;Lco/notix/d3;LE7/d;)V

    invoke-static {v4, v5, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    return-object v1

    .line 13
    :cond_9
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-ne p1, v3, :cond_a

    sget-object p1, Lco/notix/v8;->a:Lco/notix/v8;

    return-object p1

    :cond_a
    if-nez p1, :cond_b

    sget-object p1, Lco/notix/v8;->b:Lco/notix/v8;

    return-object p1

    :cond_b
    new-instance p1, LA7/b;

    .line 14
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 15
    throw p1
.end method

.method public final bridge synthetic a(Lco/notix/u8;Lco/notix/mj;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, Lco/notix/l8;

    invoke-virtual {p0, p1, p2}, Lco/notix/k8;->a(Lco/notix/l8;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
