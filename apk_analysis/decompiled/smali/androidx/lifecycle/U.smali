.class public final Landroidx/lifecycle/U;
.super Landroidx/lifecycle/E;
.source "SourceFile"


# instance fields
.field public l:Ljava/lang/String;

.field public m:Landroidx/lifecycle/V;


# virtual methods
.method public final i(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/U;->m:Landroidx/lifecycle/V;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/lifecycle/V;->a:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/lifecycle/U;->l:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Landroidx/lifecycle/V;->d:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lb8/F;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    check-cast v0, Lb8/Q;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lb8/Q;->i(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
