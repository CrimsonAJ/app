.class public final synthetic Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/S;


# instance fields
.field public final synthetic a:Lw0/d;


# direct methods
.method public synthetic constructor <init>(Lw0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/a;->a:Lw0/d;

    return-void
.end method


# virtual methods
.method public final a(Li0/M;Li0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/a;->a:Lw0/d;

    .line 2
    .line 3
    const-string v1, "this$0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "<anonymous parameter 0>"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "childFragment"

    .line 14
    .line 15
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, Lw0/d;->e:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    iget-object v1, p2, Li0/v;->y:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/r;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p2, Li0/v;->m0:Landroidx/lifecycle/y;

    .line 32
    .line 33
    iget-object v1, v0, Lw0/d;->f:LN0/b;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroidx/lifecycle/y;->V(Landroidx/lifecycle/v;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object p1, v0, Lw0/d;->g:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    iget-object p2, p2, Li0/v;->y:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/jvm/internal/r;->b(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
.end method
