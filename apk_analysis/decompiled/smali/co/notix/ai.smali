.class public abstract Lco/notix/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lco/notix/di;Ljava/lang/String;)Lco/notix/er;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/zh;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lco/notix/zh;-><init>(Lco/notix/di;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    return-object v0
.end method
