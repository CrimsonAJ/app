.class public final Lco/notix/d7;
.super Lco/notix/h3;
.source "SourceFile"

# interfaces
.implements Lco/notix/appopen/AppOpenLoader;


# direct methods
.method public constructor <init>(Lco/notix/i3;)V
    .locals 1

    const-string v0, "adLoaderDelegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lco/notix/h3;-><init>(Lco/notix/i3;I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/notix/g;)Lco/notix/e3;
    .locals 1

    .line 1
    instance-of v0, p1, Lco/notix/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lco/notix/c7;

    .line 6
    .line 7
    check-cast p1, Lco/notix/i;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lco/notix/c7;-><init>(Lco/notix/i;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return-object p1
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
