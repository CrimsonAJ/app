.class public final Lco/notix/fm;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:Lco/notix/ll;


# direct methods
.method public constructor <init>(Lco/notix/ll;)V
    .locals 0

    iput-object p1, p0, Lco/notix/fm;->a:Lco/notix/ll;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x13

    .line 6
    .line 7
    invoke-static {p1, v0}, LB7/k;->E0(Ljava/util/List;I)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p1, LB7/t;->a:LB7/t;

    .line 13
    .line 14
    :goto_0
    new-instance v0, Lco/notix/tj;

    .line 15
    .line 16
    iget-object v1, p0, Lco/notix/fm;->a:Lco/notix/ll;

    .line 17
    .line 18
    iget-wide v2, v1, Lco/notix/ll;->d:J

    .line 19
    .line 20
    iget-object v1, v1, Lco/notix/ll;->b:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v4, 0xc8

    .line 23
    .line 24
    invoke-static {v4, v1}, LW7/d;->h0(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v2, v3, v1}, Lco/notix/tj;-><init>(JLjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, LB7/k;->z0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
    .line 36
    .line 37
    .line 38
.end method
