.class public final Lco/notix/startup/NotixInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LT0/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lco/notix/wq;->C:Lco/notix/sg;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lco/notix/sg;->b:Lco/notix/e9;

    .line 12
    .line 13
    check-cast v1, Lco/notix/d9;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lco/notix/d9;->a(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lco/notix/sg;->e:LY7/z;

    .line 19
    .line 20
    new-instance v2, Lco/notix/rg;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v0, p1, v3}, Lco/notix/rg;-><init>(Lco/notix/sg;Landroid/content/Context;LE7/d;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    invoke-static {v1, v3, v2, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 28
    .line 29
    .line 30
    sget-object p1, Lco/notix/wq;->D:Lco/notix/sg;

    .line 31
    .line 32
    return-object p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1

    const-class v0, Landroidx/work/WorkManagerInitializer;

    invoke-static {v0}, LB6/u0;->D(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
